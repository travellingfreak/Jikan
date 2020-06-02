package com.schalar.jikan.request.person;

import com.schalar.jikan.request.Request;

public class PersonPicturesRequest implements Request {

    private final Integer id;

    public PersonPicturesRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/person/%s/pictures", this.id);
    }

}
