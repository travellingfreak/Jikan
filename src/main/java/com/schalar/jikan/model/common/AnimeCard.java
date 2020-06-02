package com.schalar.jikan.model.common;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class AnimeCard extends Model {

    protected final Integer malId;

    protected final String url;

    protected final String title;

    protected final String imageUrl;

    protected final String synopsis;

    protected final String type;

    protected final LocalDateTime airingStart;

    protected final Integer episodes;

    protected final Integer members;

    protected final List<MalUrl> genres;

    protected final String source;

    protected final List<MalUrl> producers;

    protected final Double score;

    protected final List<String> licensors;

    protected final Boolean r18;

    protected final Boolean kids;

    public AnimeCard(@NotNull JSONObject jsonObject) {
        this.imageUrl = jsonObject.getString("image_url");
        this.malId = jsonObject.getInt("mal_id");
        this.synopsis = jsonObject.getString("synopsis");
        this.source = jsonObject.getString("source");
        this.title = jsonObject.getString("title");
        this.type = jsonObject.getString("type");
        this.licensors = Collections.singletonList(jsonObject.getJSONArray("licensors").toString());
        this.url = jsonObject.getString("url");
        this.producers = (List<MalUrl>) buildUrlList().apply(jsonObject.get("producers"));
        this.score = jsonObject.get("score") == JSONObject.NULL ? null : (jsonObject.get("score") instanceof Integer ? jsonObject.getInt("score") : jsonObject.getDouble("score"));
        this.airingStart = jsonObject.get("airing_start") == JSONObject.NULL ? null : LocalDateTime.parse(((String) jsonObject.get("airing_start")).replace("+00:00", ""));
        this.genres = (List<MalUrl>) buildUrlList().apply(jsonObject.get("genres"));
        this.members = jsonObject.getInt("members");
        this.r18 = jsonObject.getBoolean("r18");
        this.episodes = jsonObject.get("episodes") == JSONObject.NULL ? null : (Integer) jsonObject.get("episodes");
        this.kids = jsonObject.getBoolean("kids");
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
    public LocalDateTime getAiringStart() {
        return airingStart;
    }

    @Nullable
    public Integer getEpisodes() {
        return episodes;
    }

    public Integer getMembers() {
        return members;
    }

    public List<MalUrl> getGenres() {
        return genres;
    }

    public String getSource() {
        return source;
    }

    public List<MalUrl> getProducers() {
        return producers;
    }

    @Nullable
    public Double getScore() {
        return score;
    }

    @Nullable
    public List<String> getLicensors() {
        return licensors;
    }

    public Boolean isR18() {
        return r18;
    }

    public Boolean isKids() {
        return kids;
    }

}
