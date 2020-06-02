package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimeRequest implements Request {

    private final Integer id;

    public AnimeRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s", this.id);
    }

}
