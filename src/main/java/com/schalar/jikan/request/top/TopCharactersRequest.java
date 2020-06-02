package com.schalar.jikan.request.top;

import com.schalar.jikan.request.Request;

public class TopCharactersRequest implements Request {

    private final Integer page;

    public TopCharactersRequest() {
        this(1);
    }

    public TopCharactersRequest(Integer page) {
        this.page = page;
    }

    @Override
    public String getPath() {
        return String.format("/top/characters/%s", this.page);
    }

}
