package com.schalar.jikan.request.manga;

import com.schalar.jikan.request.Request;

public class MangaForumRequest implements Request {

    private final Integer id;

    public MangaForumRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/manga/%S/forum", this.id);
    }

}
