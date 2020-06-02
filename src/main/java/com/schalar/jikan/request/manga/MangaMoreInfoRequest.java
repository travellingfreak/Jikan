package com.schalar.jikan.request.manga;

import com.schalar.jikan.request.Request;

public class MangaMoreInfoRequest implements Request {

    private final Integer id;

    public MangaMoreInfoRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/manga/%s/moreinfo", this.id);
    }

}
