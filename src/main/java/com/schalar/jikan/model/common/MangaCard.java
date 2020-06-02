package com.schalar.jikan.model.common;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.List;

public class MangaCard extends Model {

    protected final Integer malId;

    protected final String url;

    protected final String title;

    protected final String imageUrl;

    protected final String synopsis;

    protected final String type;

    protected final LocalDateTime publishingStart;

    protected final Integer volumes;

    protected final Integer members;

    protected final List<MalUrl> genres;

    protected final List<MalUrl> authors;

    protected final Double score;

    protected final List<String> serialization;

    public MangaCard(@NotNull JSONObject jsonObject) {
        this.imageUrl = jsonObject.getString("image_url");
        this.publishingStart = jsonObject.get("publishing_start") != JSONObject.NULL ? LocalDateTime.parse(((String) jsonObject.get("publishing_start")).replace("+00:00", "")) : null;
        this.volumes = jsonObject.get("volumes") != JSONObject.NULL ? (Integer) jsonObject.get("volumes") : null;
        this.malId = jsonObject.getInt("mal_id");
        this.synopsis = jsonObject.getString("synopsis");
        this.title = jsonObject.getString("title");
        this.type = jsonObject.getString("type");
        this.url = jsonObject.getString("url");
        this.serialization = (List<String>) buildStringList().apply(jsonObject.getJSONArray("serialization"));
        this.score = jsonObject.get("score") != JSONObject.NULL ? (jsonObject.get("score") instanceof Integer ? (Integer) jsonObject.get("score") : (Double) jsonObject.get("score")) : null;
        this.genres = (List<MalUrl>) buildUrlList().apply(jsonObject.getJSONArray("genres"));
        this.members = jsonObject.getInt("members");
        this.authors = (List<MalUrl>) buildUrlList().apply(jsonObject.getJSONArray("authors"));
    }

    @Override
    public String toString() {
        return this.url;
    }

    public Integer getMalId() {
        return malId;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getType() {
        return type;
    }

    @Nullable
    public LocalDateTime getPublishingStart() {
        return publishingStart;
    }

    @Nullable
    public Integer getVolumes() {
        return volumes;
    }

    public Integer getMembers() {
        return members;
    }

    public List<MalUrl> getGenres() {
        return genres;
    }

    public List<MalUrl> getAuthors() {
        return authors;
    }

    @Nullable
    public Double getScore() {
        return score;
    }

    @Nullable
    public List<String> getSerialization() {
        return serialization;
    }

}
