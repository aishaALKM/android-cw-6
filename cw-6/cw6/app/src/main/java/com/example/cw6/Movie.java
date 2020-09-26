package com.example.cw6;

public class Movie {
    public String getTitle() {
        return title;
    }

    private String title = "Matilda";
    private String mainActor = "Mara";
    private double movieRate = 10 ;
    private int PgRate = 10;
    private String genre ="comedy/drama";

    public Movie(String title, String mainActor, double movieRate, int pgRate, String genre) {
        this.title = title;
        this.mainActor = mainActor;
        this.movieRate = movieRate;
        PgRate = pgRate;
        this.genre = genre;
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
        if(movieRate == 10)
        this.movieRate = movieRate;
        else this.movieRate=10;
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

