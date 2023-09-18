package com.revature.models;

public class Movie {

    private int movieId;
    private String movieTitle;

    private Director director;

    //boilerplate code---------------------

    public Movie() {
    }

    public Movie(int movieId, String movieTitle, Director director) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.director = director;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieTitle='" + movieTitle + '\'' +
                ", director=" + director +
                '}';
    }
}
