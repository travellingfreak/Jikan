package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

import static com.schalar.jikan.helper.Client.http_build_query;

public class AnimeForumRequest implements Request {

    private static final List<String> validTypes = List.of("all", "episode", "other");

    private final Integer id;

    private final String topic;

    public AnimeForumRequest(Integer id) {
        this(id, null);
    }

    public AnimeForumRequest(Integer id, @Nullable String topic) {
        this.id = id;
        this.topic = topic;
    }

    @Override
    public String getPath() {
        String query = "";
        if (this.topic != null && validTypes.contains(this.topic)) {
            query = "?" + http_build_query(Map.of("topic", this.topic));
        }

        //TODO: Add support for filtering once it's added to the API.

        return String.format("/anime/%s/forum", this.id);
    }

}
