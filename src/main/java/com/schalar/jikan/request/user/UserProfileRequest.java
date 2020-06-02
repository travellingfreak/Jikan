package com.schalar.jikan.request.user;

import com.schalar.jikan.request.Request;

public class UserProfileRequest implements Request {

    private final String username;

    public UserProfileRequest(String username) {
        this.username = username;
    }

    @Override
    public String getPath() {
        return String.format("/user/%s", this.username);
    }

}
