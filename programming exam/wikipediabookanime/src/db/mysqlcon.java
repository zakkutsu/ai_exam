package db;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;



public class mysqlcon {


    private static String MYSQL_JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static String MYSQL_DB_URL = "jdbc:mysql://localhost:3306/db_myanimelist";
    private static String MYSQL_DB_USER = "root";
    private static String MYSQL_DB_USER_PASSWORD = "";
    private static String SQL_QUERY = "SELECT DATABASE() FROM DUAL";

    public static void connect() {
            
        try(Connection connection = DriverManager.getConnection(MYSQL_DB_URL,MYSQL_DB_USER,MYSQL_DB_USER_PASSWORD)) {


            // CARA TAMBAH DRIVER MYSQL : 
            // VSCODE : ctrl + shift + p > java classpath > tambah jar driver
            // NETBEANS : lupa
            Class.forName(MYSQL_JDBC_DRIVER_CLASS); 
            Statement statement =connection.createStatement(); 
            
            
            ResultSet resultSet = statement.executeQuery(SQL_QUERY); 

            while(resultSet.next())  {
                if (resultSet.getString(1).equals("db_myanimelist") ) {
                    System.out.println("Database Connected...");
                } 
            }     
                
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver class not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error occured while executing query: ");

            e.printStackTrace();
        } 
    }

    public static ResultSet getQuery(String query) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName(MYSQL_JDBC_DRIVER_CLASS);

            connection = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_USER_PASSWORD);

            statement = connection.prepareStatement(query);

            resultSet = statement.executeQuery();
            resultSet = (resultSet == null) ? null : resultSet;
            return resultSet;
        } finally {
            System.out.println();
        }
    }


    public static void initQuery(String query) throws SQLException, ClassNotFoundException{
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName(MYSQL_JDBC_DRIVER_CLASS);

            connection = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_USER_PASSWORD);

            statement = connection.createStatement();

            statement.executeUpdate(query);
        } finally {

            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }


        }
    }



     public static void main(String[] args) throws ClassNotFoundException, SQLException {
        connect();

     }
}
