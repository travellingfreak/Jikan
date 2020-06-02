package com.schalar.jikan.request.top;

import com.schalar.jikan.request.Request;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.schalar.jikan.helper.Constants.*;

public class TopAnimeRequest implements Request {

    private final Integer page;

    @Nullable
    private final String type;

    public TopAnimeRequest() {
        this(1);
    }

    public TopAnimeRequest(Integer page) {
        this(page, null);
    }

    public TopAnimeRequest(Integer page, @Nullable String type) {
        this.page = page;

        if (type != null) {
            if (!List.of(TOP_AIRING, TOP_UPCOMING, TOP_TV, TOP_MOVIE, TOP_OVA, TOP_SPECIAL, TOP_BY_POPULARITY, TOP_BY_FAVORITES).contains(type)) {
                throw new IllegalArgumentException(String.format("Type %s is not valid.", type));
            }
        }

        this.type = type;
    }

    @Override
    public String getPath() {
        return String.format("/top/anime/%s/%s", this.page, this.type);
    }

}
