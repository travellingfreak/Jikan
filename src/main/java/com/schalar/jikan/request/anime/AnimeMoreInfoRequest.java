package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimeMoreInfoRequest implements Request {

    private final Integer id;

    public AnimeMoreInfoRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s/moreinfo", this.id);
    }

}
