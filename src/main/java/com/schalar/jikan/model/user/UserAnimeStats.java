package com.schalar.jikan.model.user;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class UserAnimeStats extends Model {

    private final Double daysWatched;

    private final Double meanScore;

    private final Integer watching;

    private final Integer completed;

    private final Integer onHold;

    private final Integer dropped;

    private final Integer planToWatch;

    private final Integer totalEntries;

    private final Integer rewatched;

    private final Integer episodesWatched;

    public UserAnimeStats(@NotNull JSONObject jsonObject) {
        this.planToWatch = jsonObject.getInt("plan_to_watch");
        this.rewatched = jsonObject.getInt("rewatched");
        this.dropped = jsonObject.getInt("dropped");
        this.episodesWatched = jsonObject.getInt("episodes_watched");
        this.daysWatched = jsonObject.getDouble("days_watched");
        this.completed = jsonObject.getInt("completed");
        this.onHold = jsonObject.getInt("on_hold");
        this.meanScore = jsonObject.getDouble("mean_score");
        this.watching = jsonObject.getInt("watching");
        this.totalEntries = jsonObject.getInt("total_entries");
    }

    public Double getDaysWatched() {
        return daysWatched;
    }

    public Double getMeanScore() {
        return meanScore;
    }

    public Integer getWatching() {
        return watching;
    }

    public Integer getCompleted() {
        return completed;
    }

    public Integer getOnHold() {
        return onHold;
    }

    public Integer getDropped() {
        return dropped;
    }

    public Integer getPlanToWatch() {
        return planToWatch;
    }

    public Integer getTotalEntries() {
        return totalEntries;
    }

    public Integer getRewatched() {
        return rewatched;
    }

    public Integer getEpisodesWatched() {
        return episodesWatched;
    }

}
