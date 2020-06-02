package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimePicturesRequest implements Request {

    private final Integer id;

    public AnimePicturesRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s/pictures", this.id);
    }

}
