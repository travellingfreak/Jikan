package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimeRecentlyUpdatedByUsersRequest implements Request {

    private final Integer id;

    private final Integer page;

    public AnimeRecentlyUpdatedByUsersRequest(Integer id) {
        this(id, 1);
    }

    public AnimeRecentlyUpdatedByUsersRequest(Integer id, Integer page) {
        this.id = id;
        this.page = (page - 1) * 75;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s/userupdates/%s", this.id, this.page);
    }

}
