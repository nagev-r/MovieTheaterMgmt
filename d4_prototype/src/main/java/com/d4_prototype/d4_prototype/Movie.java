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
    private List<String> showtimes; // having a list of showtimes and only one 2d array for reserved seating doesn't take into account
    private int[][] seats;          // that different show times will have different seatings, but it should be fine for the video
    private int remainingSeats; 

    public Movie() {}

    public Movie(String id, String title, int year, String rating, String director, List<String> genres, String posterPath, List<String> showtimes) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.director = director;
        this.genres = genres;
        this.posterPath = posterPath;
        this.showtimes = showtimes;
        this.seats = new int[7][10]; //hard coding row and column values because of "set movie theater size"

        for (int row = 0; row < 7; row++){ // filling 2d array with 0's to show emptiness
            for (int column = 0; column < 10; column++){
                this.seats[row][column] = 0;
            }
        }
        this.remainingSeats = 70;

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

    public List<String> getShowtimes() {
        return showtimes;
    }

    public boolean isReserved(int row, int column){
        return seats[row][column] == 1; // return true if seat is occupied (is 1)
    }

    public int getRemainingSeats(){
        return remainingSeats;
    }

    public void reserveSeat(int row, int column){
        seats[row][column] = 1;
        remainingSeats--;
    }

}
