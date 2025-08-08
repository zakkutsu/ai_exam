package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import db.mysqlcon;
import java.util.ArrayList;
import java.util.List;
import models.Anime;

public class animeController {

    public static void main(String[] args) throws ClassNotFoundException {
        getAllAnimeData();
        System.out.println("\"");
    }

    public static List<Anime> getAllAnimeData() throws ClassNotFoundException {
        String query = "SELECT * FROM anime";
        List<Anime> animeList = new ArrayList<>();

        try (ResultSet data = mysqlcon.getQuery(query)) {
            while (data.next()) {
                int anime_id = data.getInt("anime_id");
                String anime_title = data.getString("anime_title");
                String genre = data.getString("genre");
                int episodes = data.getInt("episodes");
                double rating = data.getDouble("rating");
                String image_link = data.getString("image_link");
                int studio_id = data.getInt("studio_id");
                String synopsis = data.getString("synopsis");

                // Use the anime data as needed
                Anime anime = new Anime(anime_id, anime_title, genre, episodes, rating, image_link, studio_id, "", synopsis);
                animeList.add(anime);

            }

        } catch (SQLException e) {
            System.out.println("Error :" + e.getMessage());
            e.printStackTrace();
        }
         return animeList;
        
    }

    public static List<Anime> searchAnimeByTitle(String anime_title) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM anime LEFT JOIN studio on studio.studio_id = anime.studio_id where anime_title = '"+ anime_title+"'";
        List<Anime> animeList = new ArrayList<>();
        
        try(ResultSet data = mysqlcon.getQuery(query)) {
            while(data.next()) {
                int anime_id = data.getInt("anime_id");
                String animeTitle = data.getString("anime_title");
                String genre = data.getString("genre");
                int episodes = data.getInt("episodes");
                double rating = data.getDouble("rating");
                String image_link = data.getString("image_link");
                int studio_id = data.getInt("studio_id");
                String studio_name = data.getString("studio_name");
                String synopsis = data.getString("synopsis");
                
                
                Anime anime = new Anime(anime_id, anime_title, genre, episodes, rating, image_link, studio_id, studio_name, synopsis);
                animeList.add(anime);
            }
        }
        
        return animeList;
        
        
    }



}
