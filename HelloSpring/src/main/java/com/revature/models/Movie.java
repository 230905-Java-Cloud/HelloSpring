package com.revature.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //again, we want this Class to be registered as a Bean in the IoC container
@Scope("prototype") //now, Movie is not singleton scoped!!
public class Movie {

    private int movieId;
    private String movieTitle;

    private Director director;

    //boilerplate code---------------------

    //CONSTRUCTOR INJECTION - a dependency-only constructor to wire director as a dependency of movie
    //I prefer this over setter injection because the wiring happens ASAP (as opposed to with setter)
    @Autowired
    public Movie(Director director) {
        this.director = director;
    }

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

    //@Autowired - SETTER INJECTION - using the setter to define director as a dependency of movie
    //this dependency injection won't happen until director is set
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
