package com.schalar.jikan.request.top;

import com.schalar.jikan.request.Request;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.schalar.jikan.helper.Constants.*;

public class TopMangaRequest implements Request {

    private final Integer page;

    @Nullable
    private final String type;

    public TopMangaRequest() {
        this(1);
    }

    public TopMangaRequest(Integer page) {
        this(page, null);
    }

    public TopMangaRequest(Integer page, @Nullable String type) {
        this.page = page;

        if (type != null) {
            if (!List.of(TOP_MANGA, TOP_NOVEL, TOP_ONE_SHOT, TOP_DOUJINSHI, TOP_MANHWA, TOP_MANHUA, TOP_BY_POPULARITY, TOP_BY_FAVORITES).contains(type)) {
                throw new IllegalArgumentException(String.format("Type %s is not valid.", type));
            }
        }

        this.type = type;
    }

    @Override
    public String getPath() {
        return String.format("/top/manga/%s/%s", this.page, this.type);
    }

}
