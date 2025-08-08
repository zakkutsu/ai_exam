/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

import db.mysqlcon;

/**
 *
 * @author ACER
 */

public class userController {



    
    public static void main(String[] args) throws ClassNotFoundException {
        GetAllUserData();
        System.out.println("\"");
    }

    public static void GetAllUserData() throws ClassNotFoundException {
        String query = "SELECT * FROM user";


        try(ResultSet data = mysqlcon.getQuery(query) ){


            while (data.next()) {
                int user_id = data.getInt(1);
                String username = data.getString(2);
                String password = data.getString(3);
                String email = data.getString(4);
                String birthdate = data.getString(5);
            }
            
        } catch (SQLException e) {
            System.out.println("Error :" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void insertUserData(String username, String password, String email, String birthdate) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO user (user_id , username, password, email, birthdate ) VALUES " + "(" + 0 + ",\"" + username + "\",\"" + password  + "\",\"" + email + "\",\"" + birthdate + "\");";
        mysqlcon.initQuery(query);
    }

    public static void updateUserData(int user_id, String username, String password, String email, String birthdate) throws ClassNotFoundException, SQLException {
        String query = "UPDATE user SET username=\"" + username + "\", password=\"" + password + "\", email=\"" + email + "\", birthdate=\"" + birthdate + "\" WHERE user_id=" + user_id + ";";
        mysqlcon.initQuery(query);
    }

    public static void deleteUserData(int user_id) throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM user WHERE user_id=" + user_id + ";";
        mysqlcon.initQuery(query);
    }


    // PR : Login Logic
    public static int loginUser(String username, String password) throws ClassNotFoundException, SQLException {
        String query = "SELECT username, password FROM user WHERE username=\"" + username + "\" AND password=\"" + password + "\";";

        Resultset result = (Resultset) mysqlcon.getQuery(query);
        if (((ResultSet) result).next()){
            return 1;

        } else {
            return 0;
        }
    }

    public static int getUserid(String username) throws SQLException, ClassNotFoundException {
        String query = "SELECT user_id FROM user WHERE username =\"" + username + "\"";

        ResultSet result = mysqlcon.getQuery(query);
        while (result.next()) {
            int user_id = result.getInt(1);
            return user_id;
        }

        return 0;


    }





}


