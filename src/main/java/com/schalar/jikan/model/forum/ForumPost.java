package com.schalar.jikan.model.forum;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;

public class ForumPost extends Model {

    private final String url;

    private final String authorName;

    private final String authorUrl;

    @Nullable
    private final LocalDateTime datePosted;

    public ForumPost(String url, String authorName, String authorUrl, @Nullable LocalDateTime datePosted) {
        this.url = url;
        this.authorName = authorName;
        this.authorUrl = authorUrl;
        this.datePosted = datePosted;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    @Nullable
    public LocalDateTime getDatePosted() {
        return datePosted;
    }

}
