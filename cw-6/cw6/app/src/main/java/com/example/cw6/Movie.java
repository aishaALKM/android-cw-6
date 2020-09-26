package com.example.cw6;

public class Movie {
    private String title ;
    private String mainActor ;
    private double movieRate  ;
    private int PgRate ;
    private String genre ;

    public Movie(String title, String mainActor, double movieRate, int pgRate, String genre) {
        this.title = title;
        this.mainActor = mainActor;
        this.movieRate = movieRate;
        PgRate = pgRate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public double getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(double movieRate) {
        this.movieRate = movieRate;
    }

    public int getPgRate() {
        return PgRate;
    }

    public void setPgRate(int pgRate) {
        PgRate = pgRate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}


