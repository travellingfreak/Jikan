package com.schalar.jikan.request.genre;

import com.schalar.jikan.request.Request;

public class AnimeGenreRequest implements Request {

    private final Integer id;

    private final Integer page;

    public AnimeGenreRequest(Integer id) {
        this(id, 1);
    }

    public AnimeGenreRequest(Integer id, Integer page) {
        this.id = id;
        this.page = page;
    }

    @Override
    public String getPath() {
        return String.format("/genre/anime/%d/%d", this.id, this.page);
    }

}
