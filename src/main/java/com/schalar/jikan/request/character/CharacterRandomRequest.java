package com.schalar.jikan.request.character;

import com.schalar.jikan.helper.Constants;

public class CharacterRandomRequest extends CharacterRequest {

    public CharacterRandomRequest(boolean nsfw) {
        super(Constants.getRandomInteger("character", nsfw));
    }

}
