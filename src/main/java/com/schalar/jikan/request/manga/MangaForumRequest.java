package com.schalar.jikan.request.manga;

import com.schalar.jikan.request.Request;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MangaForumRequest implements Request {

    private static final List<String> validTypes = List.of("all", "episode", "other");

    private final Integer id;

    private final String topic;

    public MangaForumRequest(Integer id) {
        this(id, null);
    }

    public MangaForumRequest(Integer id, @Nullable String topic) {
        this.id = id;
        this.topic = topic;
    }

    @Override
    public String getPath() {
        //TODO: Add support for filtering once it's added to the API.
        return String.format("/manga/%S/forum", this.id);
    }

}
