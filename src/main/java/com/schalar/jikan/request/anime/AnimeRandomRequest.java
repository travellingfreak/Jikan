package com.schalar.jikan.request.anime;

import com.schalar.jikan.helper.Constants;

public class AnimeRandomRequest extends AnimeRequest {

    public AnimeRandomRequest(boolean nsfw) {
        super(Constants.getRandomInteger("anime", nsfw));
    }

}
