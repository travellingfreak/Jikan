package com.schalar.jikan.request.club;

import com.schalar.jikan.request.Request;

public class UserListRequest implements Request {

    private final Integer clubId;

    private final Integer page;

    public UserListRequest(Integer clubId) {
        this(clubId, 1);
    }

    public UserListRequest(Integer clubId, Integer page) {
        this.clubId = clubId;
        this.page = (page - 1) * 36;
    }

    @Override
    public String getPath() {
        return String.format("/club/%s/members/%d", this.clubId, this.page);
    }

}
