package com.schalar.jikan.request.manga;

import com.schalar.jikan.request.Request;

public class MangaNewsRequest implements Request {

    private final Integer id;

    public MangaNewsRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/manga/%s/news", this.id);
    }

}
