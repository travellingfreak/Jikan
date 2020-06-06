package com.schalar.jikan.request.person;

import com.schalar.jikan.helper.Constants;

public class PersonRandomRequest extends PersonRequest {

    public PersonRandomRequest(boolean nsfw) {
        super(Constants.getRandomInteger("people", nsfw));
    }

}
