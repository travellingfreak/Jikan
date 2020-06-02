package com.schalar.jikan.request.top;

import com.schalar.jikan.request.Request;

public class TopPeopleRequest implements Request {

    private final Integer page;

    public TopPeopleRequest() {
        this(1);
    }

    public TopPeopleRequest(Integer page) {
        this.page = page;
    }

    @Override
    public String getPath() {
        return String.format("/top/people/%s", this.page);
    }

}
