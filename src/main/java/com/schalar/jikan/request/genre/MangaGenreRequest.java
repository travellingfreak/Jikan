package com.schalar.jikan.request.genre;

import com.schalar.jikan.request.Request;

public class MangaGenreRequest implements Request {

    private final Integer id;

    private final Integer page;

    public MangaGenreRequest(Integer id) {
        this(id, 1);
    }

    public MangaGenreRequest(Integer id, Integer page) {
        this.id = id;
        this.page = page;
    }

    @Override
    public String getPath() {
        return String.format("/genre/manga/%s/%s", this.id, this.page);
    }

}
