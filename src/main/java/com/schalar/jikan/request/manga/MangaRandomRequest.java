package com.schalar.jikan.request.manga;

import com.schalar.jikan.helper.Constants;

public class MangaRandomRequest extends MangaRequest {

    public MangaRandomRequest(boolean nsfw) {
        super(Constants.getRandomInteger("manga", nsfw));
    }

}
