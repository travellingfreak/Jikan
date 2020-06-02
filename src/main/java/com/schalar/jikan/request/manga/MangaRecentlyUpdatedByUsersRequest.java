package com.schalar.jikan.request.manga;

import com.schalar.jikan.request.Request;

public class MangaRecentlyUpdatedByUsersRequest implements Request {

    private final Integer id;

    private final Integer page;

    public MangaRecentlyUpdatedByUsersRequest(Integer id) {
        this(id, 1);
    }

    public MangaRecentlyUpdatedByUsersRequest(Integer id, Integer page) {
        this.id = id;
        this.page = (page - 1) * 75;
    }

    @Override
    public String getPath() {
        return String.format("/manga/%s/userupdates/%s", this.id, this.page);
    }

}
