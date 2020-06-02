package com.schalar.jikan.request.character;

import com.schalar.jikan.request.Request;

public class CharacterRequest implements Request {

    private final Integer id;

    public CharacterRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/character/%s", this.id);
    }

}
