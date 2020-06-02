package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimeRecommendationsRequest implements Request {

    private final Integer id;

    public AnimeRecommendationsRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s/recommendations", this.id);
    }

}
