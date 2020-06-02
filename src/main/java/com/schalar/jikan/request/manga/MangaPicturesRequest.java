package com.schalar.jikan.request.manga;

import com.schalar.jikan.request.Request;

public class MangaPicturesRequest implements Request {

    private final Integer id;

    public MangaPicturesRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/manga/%s/pictures", this.id);
    }

}
