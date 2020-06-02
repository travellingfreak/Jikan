package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimeNewsRequest implements Request {

    private final Integer id;

    public AnimeNewsRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s/news", this.id);
    }

}
