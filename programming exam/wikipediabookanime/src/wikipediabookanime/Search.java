package wikipediabookanime;


import controller.animeController;
import models.Anime;
import db.mysqlcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Search extends javax.swing.JFrame {

    private static JComboBox<String> com;

    public static void init() {
        JFrame frame = new JFrame("Anime & Manga Search");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 100);
        frame.setLayout(new BorderLayout());

        com = new JComboBox<>();
        // Set a preferred size if needed
        com.setPreferredSize(new Dimension(400, 30));

        updateComboBoxData(); // Populate JComboBox with anime titles

        com.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                handleComboBoxSelection();
            }
        });

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                frame.dispose();
                frame.setVisible(false);
                String selectedValue = handleComboBoxSelection();
                
                profilanime anim = null;
                try {
                    anim = new profilanime(selectedValue);
                } catch (SQLException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                }
                anim.setVisible(true);
                anim.setTitle("Detail Anime "+selectedValue);
                
            }
        });
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0.7;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(com, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.weightx = 0.3;
        panel.add(searchButton, constraints);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static void updateComboBoxData() {
        try {
            List<Anime> animeList = animeController.getAllAnimeData();

            // Convert the List<Anime> to an array of strings
            String[] titlesArray = animeList.stream().map(Anime::getAnimeTitle).toArray(String[]::new);

            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(titlesArray);
            com.setModel(model);
            com.setEditable(true); // Allow typing for search
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static String handleComboBoxSelection() {
    String selectedValue = (String) com.getSelectedItem();
    if (selectedValue != null) {
        try {
            List<Anime> animeList = animeController.searchAnimeByTitle(selectedValue);
            if (!animeList.isEmpty()) {
                // Assuming you want to work with the first Anime in the list
                Anime anime = animeList.get(0);
                return anime.getAnimeTitle();
            } else {
                return "";
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return "";
}



//    private static void handleComboBoxSelection() throws SQLException {
//        String selectedValue = (String) com.getSelectedItem();
//        if (selectedValue != null) {
//            try {
//                Anime anime = (Anime) animeController.searchAnimeByTitle(selectedValue);
//                if (anime != null) {
//                    // Anime found, you can perform further actions
//                    System.out.println("Selected Anime: " + anime.getAnimeTitle());
//                } else {
//                    // Anime not found, handle accordingly
//                    System.out.println("Anime Not Found");
//                }
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }

    public static void main(String[] args) {
        init();
    }
}
