package wikipediabookanime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wikipediabookanime.Search;

public class MainMenu extends javax.swing.JFrame {



    public static void init () {
            
            JFrame frame = new JFrame("My Anime List");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new GridLayout(3, 1));

            JButton searchButton = new JButton("Search Anime");
            JButton viewListButton = new JButton("View My List");
            JButton exitButton = new JButton("Logout");

            searchButton.addActionListener((ActionEvent e) -> {
                // 
                frame.dispose();
                frame.setVisible(false);
                JOptionPane.showMessageDialog(frame, "Launching Search Anime feature!");
                Search.init();
            });

            viewListButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "Launching View My List feature!");
                }
            });

            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                //                    System.exit(0);
                frame.dispose();
                frame.setVisible(false);
                //                            MainMenu mn = MainMenu();
                Login.init();
                }
            });

            panel.add(searchButton);
//            panel.add(viewListButton);
            panel.add(exitButton);

            frame.add(panel);
            frame.setVisible(true);

    }
}
