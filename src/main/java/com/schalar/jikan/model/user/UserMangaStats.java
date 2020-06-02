package com.schalar.jikan.model.user;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class UserMangaStats extends Model {

    private final Double daysRead;

    private final Double meanScore;

    private final Integer reading;

    private final Integer completed;

    private final Integer onHold;

    private final Integer dropped;

    private final Integer planToRead;

    private final Integer totalEntries;

    private final Integer reread;

    private final Integer chaptersRead;

    private final Integer volumesRead;

    public UserMangaStats(@NotNull JSONObject jsonObject) {
        this.daysRead = jsonObject.getDouble("days_read");
        this.chaptersRead = jsonObject.getInt("chapters_read");
        this.reread = jsonObject.getInt("reread");
        this.dropped = jsonObject.getInt("dropped");
        this.reading = jsonObject.getInt("reading");
        this.completed = jsonObject.getInt("completed");
        this.onHold = jsonObject.getInt("on_hold");
        this.meanScore = jsonObject.getDouble("mean_score");
        this.volumesRead = jsonObject.getInt("volumes_read");
        this.totalEntries = jsonObject.getInt("total_entries");
        this.planToRead = jsonObject.getInt("plan_to_read");
    }

    public Double getDaysRead() {
        return daysRead;
    }

    public Double getMeanScore() {
        return meanScore;
    }

    public Integer getReading() {
        return reading;
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

    public Integer getPlanToRead() {
        return planToRead;
    }

    public Integer getTotalEntries() {
        return totalEntries;
    }

    public Integer getReread() {
        return reread;
    }

    public Integer getChaptersRead() {
        return chaptersRead;
    }

    public Integer getVolumesRead() {
        return volumesRead;
    }

}
