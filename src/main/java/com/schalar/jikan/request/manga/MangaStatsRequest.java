package com.schalar.jikan.request.manga;

import com.schalar.jikan.request.Request;

public class MangaStatsRequest implements Request {

    private final Integer id;

    public MangaStatsRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/manga/%s/stats", this.id);
    }

}
