package com.schalar.jikan.request.club;

import com.schalar.jikan.request.Request;

public class ClubRequest implements Request {

    private final Integer clubId;

    public ClubRequest(Integer clubId) {
        this.clubId = clubId;
    }

    @Override
    public String getPath() {
        return String.format("/club/%s", this.clubId);
    }

}
