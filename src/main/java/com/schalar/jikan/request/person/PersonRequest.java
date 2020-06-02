package com.schalar.jikan.request.person;

import com.schalar.jikan.request.Request;

public class PersonRequest implements Request {

    private final Integer id;

    public PersonRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/person/%s", this.id);
    }

}
