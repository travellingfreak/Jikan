package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimeEpisodesRequest implements Request {

    private final Integer id;

    private final Integer page;

    public AnimeEpisodesRequest(Integer id) {
        this(id, 1);
    }

    public AnimeEpisodesRequest(Integer id, Integer page) {
        this.id = id;
        this.page = (page - 1) * 100;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s/episodes/%s", this.id, this.page);
    }

}
