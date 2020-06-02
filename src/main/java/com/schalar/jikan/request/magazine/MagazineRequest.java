package com.schalar.jikan.request.magazine;

import com.schalar.jikan.request.Request;

public class MagazineRequest implements Request {

    private final Integer id;

    private final Integer page;

    public MagazineRequest(Integer id) {
        this(id, 1);
    }

    public MagazineRequest(Integer id, Integer page) {
        this.id = id;
        this.page = page;
    }

    @Override
    public String getPath() {
        return String.format("/magazine/%s/%s", this.id, this.page);
    }

}
