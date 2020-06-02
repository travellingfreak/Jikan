package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimeCharactersAndStaffRequest implements Request {

    private final Integer id;

    public AnimeCharactersAndStaffRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s/characters_staff", this.id);
    }

}
