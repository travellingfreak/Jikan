package com.schalar.jikan.model.search;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.time.LocalDateTime;

public class AnimeSearchListItem extends Model {

    private final Integer malId;

    private final String url;

    private final String imageUrl;

    private final String title;

    private final Boolean airing;

    private final String synopsis;

    private final String type;

    private final Integer episodes;

    private final Float score;

    private final LocalDateTime startDate;

    private final LocalDateTime endDate;

    private final Integer members;

    private final String rated;

    public AnimeSearchListItem(@NotNull JSONObject object) {
        this.endDate = object.get("end_date") != JSONObject.NULL ? LocalDateTime.parse(object.getString("end_date").replace("+00:00", "")) : null;
        this.imageUrl = object.getString("image_url");
        this.malId = object.getInt("mal_id");
        this.synopsis = object.getString("synopsis");
        this.title = object.getString("title");
        this.type = object.getString("type");
        this.url = object.getString("url");
        this.rated = object.get("rated") != JSONObject.NULL ? object.getString("rated") : "";
        this.score = object.getFloat("score");
        this.members = object.getInt("members");
        this.airing = object.getBoolean("airing");
        this.episodes = object.getInt("episodes");
        this.startDate = object.get("start_date") != JSONObject.NULL ? LocalDateTime.parse(object.getString("start_date").replace("+00:00", "")) : null;
    }

    public Integer getMalId() {
        return malId;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getType() {
        return type;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public Float getScore() {
        return score;
    }

    @Nullable
    public LocalDateTime getStartDate() {
        return startDate;
    }

    @Nullable
    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Integer getMembers() {
        return members;
    }

    @Nullable
    public String getRated() {
        return rated;
    }

    public Boolean isAiring() {
        return airing;
    }

}
