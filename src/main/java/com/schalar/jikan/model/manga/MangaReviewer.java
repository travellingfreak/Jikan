package com.schalar.jikan.model.manga;

import com.schalar.jikan.model.common.Reviewer;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class MangaReviewer extends Reviewer {

    private final Integer chaptersRead;

    private final MangaReviewScores scores;

    public MangaReviewer(@NotNull JSONObject object) {
        this.chaptersRead = object.getInt("chapters_read");
        this.scores = new MangaReviewScores(object.getJSONObject("scores"));
        this.imageUrl = object.getString("image_url");
        this.url = object.getString("url");
        this.username = object.getString("username");
    }

    public Integer getChaptersRead() {
        return chaptersRead;
    }

    public MangaReviewScores getScores() {
        return scores;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getUsername() {
        return username;
    }

}
