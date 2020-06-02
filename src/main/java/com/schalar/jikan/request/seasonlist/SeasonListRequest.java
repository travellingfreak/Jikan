package com.schalar.jikan.request.seasonlist;

import com.schalar.jikan.request.Request;

public class SeasonListRequest implements Request {

    @Override
    public String getPath() {
        return "/season/archive";
    }
}
