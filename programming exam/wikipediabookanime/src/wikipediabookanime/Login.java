/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wikipediabookanime;

import controller.userController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Login extends javax.swing.JFrame {

    /**
     * @param args the command line arguments
     */
    public static void init () {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("FANDOM");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 400);

            JPanel panel = new JPanel();
            panel.setLayout(new GridBagLayout());

            GridBagConstraints constraints = new GridBagConstraints();
            constraints.anchor = GridBagConstraints.WEST;
            constraints.insets = new Insets(10, 10, 10, 10);

            JLabel usernameLabel = new JLabel("Username:");
            constraints.gridx = 0;
            constraints.gridy = 0;
            panel.add(usernameLabel, constraints);

            JTextField usernameField = new JTextField(20);
            constraints.gridx = 1;
            constraints.gridy = 0;
            panel.add(usernameField, constraints);

            JLabel passwordLabel = new JLabel("Password:");
            constraints.gridx = 0;
            constraints.gridy = 1;
            panel.add(passwordLabel, constraints);

            JPasswordField passwordField = new JPasswordField(20);
            constraints.gridx = 1;
            constraints.gridy = 1;
            panel.add(passwordField, constraints);

            JButton loginButton = new JButton("Login");
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
               
                    try {
                        String user = usernameField.getText();
                    char[] password = passwordField.getPassword();
                        int userid = userController.getUserid(user);
                        int benar = userController.loginUser(user, String.valueOf(password));
                        if (benar == 1) {
                           
                            frame.setVisible(false);
//                            MainMenu mn = MainMenu();
                               MainMenu.init();
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
             
                }

               
            });
            constraints.gridx = 0;
            constraints.gridy = 2;
            constraints.gridwidth = 2;
            constraints.anchor = GridBagConstraints.CENTER;
            panel.add(loginButton, constraints);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}