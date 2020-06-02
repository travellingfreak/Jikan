package com.schalar.jikan.request.manga;

import com.schalar.jikan.request.Request;

public class MangaRequest implements Request {

    private final Integer id;

    public MangaRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/manga/%s", this.id);
    }

}
