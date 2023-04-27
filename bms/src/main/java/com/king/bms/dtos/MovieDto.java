package com.king.bms.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class MovieDto {
    @JsonProperty("movie_id")
    private int movieid;

    @JsonProperty("movie_name")
    private String movieName;

    @JsonProperty("movie_desc")
    private String moviedescription;

    @JsonProperty("release_date")
    private LocalDateTime releaseDate;

    @JsonProperty("movie_trailer_url")
    private String movieTrailerUrl;

    @JsonProperty("cover_photo_url")
    private String CoverPhotoUrl;

    private float duration;

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

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Override
    public String toString() {
        return "MovieDto{" +
                "movieid=" + movieid +
                ", movieName='" + movieName + '\'' +
                ", moviedescription='" + moviedescription + '\'' +
                ", releaseDate=" + releaseDate +
                ", movieTrailerUrl='" + movieTrailerUrl + '\'' +
                ", CoverPhotoUrl='" + CoverPhotoUrl + '\'' +
                ", duration=" + duration +
                '}';
    }
}
