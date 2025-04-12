package com.d4_prototype.d4_prototype;
import java.util.List;

public class Movie {
    private String id;
    private String title;
    private int year;
    private String rating;
    private String director;
    private List<String> genres;
    private String posterPath;

    public Movie() {}

    public Movie(String id, String title, int year, String rating, String director, List<String> genres, String posterPath) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.director = director;
        this.genres = genres;
        this.posterPath = posterPath;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getPosterPath() {
        return posterPath;
    }

}
