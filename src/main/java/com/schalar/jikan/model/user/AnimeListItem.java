package com.schalar.jikan.model.user;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.LicensorMeta;
import com.schalar.jikan.model.common.StudioMeta;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Generated(list = true)
public class AnimeListItem extends Model {

    public AnimeListItem() {
        addCustomFunctionForField("startDate", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("endDate", o -> o != JSONObject.NULL ? LocalDateTime.parse(((String) o).replace("+00:00", "")) : null);
        addCustomFunctionForField("watchStartDate", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("watchEndDate", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("studios", o -> {
            List<StudioMeta> list = new ArrayList<>();
            ((JSONArray) o).forEach(o1 -> list.add(new StudioMeta((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("licensors", o -> {
            List<LicensorMeta> list = new ArrayList<>();
            ((JSONArray) o).forEach(o1 -> list.add(new LicensorMeta((JSONObject) o1)));
            return list;
        });
    }

    private Integer malId;

    private String title;

    private String videoUrl;

    private String url;

    private String imageUrl;

    private String type;

    private Integer watchingStatus;

    private Integer score;

    private Integer watchedEpisodes;

    private Integer totalEpisodes;

    private Integer airingStatus;

    @Nullable
    private  String seasonName;

    @Nullable
    private Integer seasonYear;

    private Boolean hasEpisodeVideo;

    private Boolean hasPromoVideo;

    private Boolean hasVideo;

    private Boolean isRewatching;

    @Nullable
    private String tags;

    @Nullable
    private String rating;

    @Nullable
    private LocalDateTime startDate;

    @Nullable
    private LocalDateTime endDate;

    @Nullable
    private LocalDateTime watchStartDate;

    @Nullable
    private LocalDateTime watchEndDate;

    @Nullable
    private String days;

    @Nullable
    private String storage;

    private String priority;

    private Boolean addedToList;

    private List<StudioMeta> studios;

    private List<LicensorMeta> licensors;

    public Integer getMalId() {
        return malId;
    }

    public String getTitle() {
        return title;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getType() {
        return type;
    }

    public Integer getWatchingStatus() {
        return watchingStatus;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getWatchedEpisodes() {
        return watchedEpisodes;
    }

    public Integer getTotalEpisodes() {
        return totalEpisodes;
    }

    public Integer getAiringStatus() {
        return airingStatus;
    }

    public @Nullable String getSeasonName() {
        return seasonName;
    }

    public @Nullable Integer getSeasonYear() {
        return seasonYear;
    }

    public Boolean hasEpisodeVideo() {
        return hasEpisodeVideo;
    }

    public Boolean hasPromoVideo() {
        return hasPromoVideo;
    }

    public Boolean hasVideo() {
        return hasVideo;
    }

    public Boolean isRewatching() {
        return isRewatching;
    }

    public @Nullable String getTags() {
        return tags;
    }

    public @Nullable String getRating() {
        return rating;
    }

    public @Nullable LocalDateTime getStartDate() {
        return startDate;
    }

    public @Nullable LocalDateTime getEndDate() {
        return endDate;
    }

    public @Nullable LocalDateTime getWatchStartDate() {
        return watchStartDate;
    }

    public @Nullable LocalDateTime getWatchEndDate() {
        return watchEndDate;
    }

    public @Nullable String getDays() {
        return days;
    }

    public @Nullable String getStorage() {
        return storage;
    }

    public String getPriority() {
        return priority;
    }

    public List<StudioMeta> getStudios() {
        return studios;
    }

    public List<LicensorMeta> getLicensors() {
        return licensors;
    }

    public Boolean addedToList() {
        return addedToList;
    }

}
