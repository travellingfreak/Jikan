package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimeVideosRequest implements Request {

    private final Integer id;

    public AnimeVideosRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s/videos", this.id);
    }

}
