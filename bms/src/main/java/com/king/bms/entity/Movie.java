package com.king.bms.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieid;

    @Column(length = 50,nullable = false,unique = true)
    private String movieName;

    @Column(length = 500,nullable = false,name = "movie_desc")
    private String moviedescription;

    @Column(nullable = false)
    private LocalDateTime releaseDate;

    @Column(length = 500,name = "movie_url")
    private String movieTrailerUrl;

    @Column(length = 500,name = "cover_url")
    private String CoverPhotoUrl;

    @Column(nullable = false)
    private float duration;

    @OneToMany(mappedBy = "movie")
    private List<Booking> bookings;

    public Movie(String movieName, String moviedescription, LocalDateTime releaseDate, String movieTrailerUrl, String coverPhotoUrl, float duration) {
        this.movieName = movieName;
        this.moviedescription = moviedescription;
        this.releaseDate = releaseDate;
        this.movieTrailerUrl = movieTrailerUrl;
        CoverPhotoUrl = coverPhotoUrl;
        this.duration = duration;
    }

    @ManyToMany(mappedBy = "movies")
    private List<Theater> Theaters;

    public Movie() {
    }

    public Movie(int movieid, String movieName, String moviedescription, LocalDateTime releaseDate, String movieTrailerUrl, String coverPhotoUrl, float duration, List<Theater> theaters) {
        this.movieid = movieid;
        this.movieName = movieName;
        this.moviedescription = moviedescription;
        this.releaseDate = releaseDate;
        this.movieTrailerUrl = movieTrailerUrl;
        CoverPhotoUrl = coverPhotoUrl;
        this.duration = duration;
        Theaters = theaters;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMoviedescription() {
        return moviedescription;
    }

    public void setMoviedescription(String moviedescription) {
        this.moviedescription = moviedescription;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMovieTrailerUrl() {
        return movieTrailerUrl;
    }

    public void setMovieTrailerUrl(String movieTrailerUrl) {
        this.movieTrailerUrl = movieTrailerUrl;
    }

    public String getCoverPhotoUrl() {
        return CoverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        CoverPhotoUrl = coverPhotoUrl;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public List<Theater> getTheaters() {
        return Theaters;
    }

    public void setTheaters(List<Theater> theaters) {
        Theaters = theaters;
    }





    @Override
    public String toString() {
        return "Movie{" +
                "movieid=" + movieid +
                ", movieName='" + movieName + '\'' +
                ", moviedescription='" + moviedescription + '\'' +
                ", releaseDate=" + releaseDate +
                ", movieTrailerUrl='" + movieTrailerUrl + '\'' +
                ", CoverPhotoUrl='" + CoverPhotoUrl + '\'' +
                ", duration=" + duration +
                ", Theaters=" + Theaters +
                '}';
    }
}
