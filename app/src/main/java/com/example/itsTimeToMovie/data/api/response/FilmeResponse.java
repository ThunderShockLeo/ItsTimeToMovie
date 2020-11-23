package com.example.itsTimeToMovie.data.api.response;

import com.squareup.moshi.Json;

public class FilmeResponse {

    @Json(name = "poster_path")
    private final String posterPath;

    @Json(name = "original_title")
    private final String title;

    @Json(name = "overview")
    private final String description;

    public FilmeResponse(String posterPath, String title, String description) {
        this.posterPath = posterPath;
        this.title = title;
        this.description = description;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {return description;}
}
