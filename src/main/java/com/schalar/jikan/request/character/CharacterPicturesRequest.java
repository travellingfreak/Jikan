package com.schalar.jikan.request.character;

import com.schalar.jikan.request.Request;

public class CharacterPicturesRequest implements Request {

    private final Integer id;

    public CharacterPicturesRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/character/%s/pictures", this.id);
    }

}
