package models;

public class Anime {

    private int anime_id;
    private String anime_title;
    private String genre;
    private int episodes;
    private double rating;
    private String image_link;
    private int studio_id;
    private String studio_name;
    private String synopsis;

    public Anime(int anime_id, String anime_title, String genre, int episodes, double rating, String image_link, int studio_id, String studio_name, String synopsis) {
        this.anime_id = anime_id;
        this.anime_title = anime_title;
        this.genre = genre;
        this.episodes = episodes;
        this.rating = rating;
        this.image_link = image_link;
        this.studio_id = studio_id;
        this.studio_name = studio_name;
        this.synopsis = synopsis;
        
    }

    public int getAnimeId() {
        return anime_id;
    }

    public String getAnimeTitle() {
        return anime_title;
    }

    public String getGenre() {
        return genre;
    }

    public int getEpisodes() {
        return episodes;
    }

    public double getRating() {
        return rating;
    }
    
    public String getImg() {
        return image_link;
    }
    
    public int getStd() {
        return studio_id;
    }
    
    public String getStdname() {
        return studio_name;
    }
    
    public String getSnp() {
        return synopsis;
    }
}
