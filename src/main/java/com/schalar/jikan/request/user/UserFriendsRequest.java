package com.schalar.jikan.request.user;

import com.schalar.jikan.request.Request;

public class UserFriendsRequest implements Request {

    private final String username;

    private final Integer page;

    public UserFriendsRequest(String username) {
        this(username, 1);
    }

    public UserFriendsRequest(String username, Integer page) {
        this.username = username;
        this.page = page;
    }

    @Override
    public String getPath() {
        return String.format("/user/%s/friends/%s", this.username, this.page);
    }

}
