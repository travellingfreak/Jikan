package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimeReviewsRequest implements Request {

    private final Integer id;

    private final Integer page;

    public AnimeReviewsRequest(Integer id) {
        this(id, 1);
    }

    public AnimeReviewsRequest(Integer id, Integer page) {
        this.id = id;
        this.page = page;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s/reviews/%s", this.id, this.page);
    }

}