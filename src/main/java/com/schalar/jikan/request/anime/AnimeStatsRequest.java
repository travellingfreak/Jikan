package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimeStatsRequest implements Request {

    private final Integer id;

    public AnimeStatsRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s/stats", this.id);
    }

}
