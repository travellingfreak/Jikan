package com.schalar.jikan.request.manga;

import com.schalar.jikan.request.Request;

public class MangaCharactersRequest implements Request {

    private final Integer id;

    public MangaCharactersRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/manga/%s/characters", this.id);
    }

}
