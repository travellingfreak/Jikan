package com.schalar.jikan.request.manga;

import com.schalar.jikan.request.Request;

public class MangaRecommendationsRequest implements Request {

    private final Integer id;

    public MangaRecommendationsRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/manga/%s/recommendations", this.id);
    }

}
