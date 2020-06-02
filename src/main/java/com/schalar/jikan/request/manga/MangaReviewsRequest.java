package com.schalar.jikan.request.manga;

import com.schalar.jikan.request.Request;

public class MangaReviewsRequest implements Request {

    private final Integer id;

    private final Integer page;

    public MangaReviewsRequest(Integer id) {
        this(id, 1);
    }

    public MangaReviewsRequest(Integer id, Integer page) {
        this.id = id;
        this.page = page;
    }

    @Override
    public String getPath() {
        return String.format("/manga/%s/reviews/%s", this.id, this.page);
    }

}
