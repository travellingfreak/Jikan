package com.schalar.jikan.model.search;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.time.LocalDateTime;

public class MangaSearchListItem extends Model {

    private final Integer malId;

    private final String url;

    private final String imageUrl;

    private final String title;

    private final Boolean publishing;

    private final String synopsis;

    private final String type;

    private final Integer chapters;

    private final Integer volumes;

    private final Float score;

    private final LocalDateTime startDate;

    private final LocalDateTime endDate;

    private final Integer members;

    public MangaSearchListItem(@NotNull JSONObject jsonObject) {
        this.endDate = jsonObject.get("end_date") == JSONObject.NULL ? null : LocalDateTime.parse(((String) jsonObject.get("end_date")).replace("+00:00", ""));
        this.chapters = jsonObject.getInt("chapters");
        this.imageUrl = jsonObject.getString("image_url");
        this.volumes = jsonObject.getInt("volumes");
        this.malId = jsonObject.getInt("mal_id");
        this.synopsis = jsonObject.getString("synopsis");
        this.title = jsonObject.getString("title");
        this.type = jsonObject.getString("type");
        this.url = jsonObject.getString("url");
        this.score = jsonObject.getFloat("score");
        this.members = jsonObject.getInt("members");
        this.publishing = jsonObject.getBoolean("publishing");
        this.startDate = jsonObject.get("start_date") == JSONObject.NULL ? null : LocalDateTime.parse(((String) jsonObject.get("start_date")).replace("+00:00", ""));
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

    public Integer getChapters() {
        return chapters;
    }

    public Integer getVolumes() {
        return volumes;
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

    public Boolean isPublishing() {
        return publishing;
    }

}
