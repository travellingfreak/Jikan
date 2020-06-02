package com.schalar.jikan.model.anime;

import com.schalar.jikan.model.common.Reviewer;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class AnimeReviewer extends Reviewer {

    private final Integer episodesSeen;

    private final AnimeReviewScores scores;

    public AnimeReviewer(@NotNull JSONObject object) {
        this.scores = new AnimeReviewScores(object.getJSONObject("scores"));
        this.imageUrl = object.getString("image_url");
        this.episodesSeen = object.getInt("episodes_seen");
        this.url = object.getString("url");
        this.username = object.getString("username");
    }

    public Integer getEpisodesSeen() {
        return episodesSeen;
    }

    public AnimeReviewScores getScores() {
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
