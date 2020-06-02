package com.schalar.jikan.request.user;

import com.schalar.jikan.helper.Constants;
import com.schalar.jikan.request.Request;

public class UserMangaListRequest implements Request {

    private final String username;

    private final Integer page;

    private final String status;

    public UserMangaListRequest(String username) {
        this(username, 1);
    }

    public UserMangaListRequest(String username, Integer page) {
        this(username, page, Constants.USER_ANIME_LIST_ALL);
    }

    public UserMangaListRequest(String username, Integer page, String status) {
        this.username = username;
        this.page = page;
        this.status = status;
    }

    @Override
    public String getPath() {
        return String.format("/user/%s/mangalist/%s/%s", this.username, this.status, this.page);
    }

}
