package com.schalar.jikan.model.user;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MagazineMeta;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Generated(list = true)
public class MangaListItem extends Model {

    public MangaListItem() {
        addCustomFunctionForField("startDate", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("endDate", o -> o != JSONObject.NULL ? LocalDateTime.parse(((String) o).replace("+00:00", "")) : null);
        addCustomFunctionForField("readStartDate", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("readEndDate", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("magazines", o -> {
            List<MagazineMeta> list = new ArrayList<>();
            ((JSONArray) o).forEach(o1 -> list.add(new MagazineMeta((JSONObject) o1)));
            return list;
        });
    }

    private Integer malId;

    private String title;

    private String url;

    private String imageUrl;

    private String type;

    private Integer readingStatus;

    private Integer score;

    private Integer readChapters;

    private Integer readVolumes;

    private Integer totalChapters;

    private Integer totalVolumes;

    private Integer publishingStatus;

    private Boolean isRereading;

    @Nullable
    private String tags;

    @Nullable
    private LocalDateTime startDate;

    @Nullable
    private LocalDateTime endDate;

    @Nullable
    private LocalDateTime readStartDate;

    @Nullable
    private LocalDateTime readEndDate;

    @Nullable
    private String days;

    @Nullable
    private String retail;

    private String priority;

    private Boolean addedToList;

    private List<MagazineMeta> magazines;

    public Integer getMalId() {
        return malId;
    }

    public String getTitle() {
        return title;
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

    public Integer getReadingStatus() {
        return readingStatus;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getReadChapters() {
        return readChapters;
    }

    public Integer getReadVolumes() {
        return readVolumes;
    }

    public Integer getTotalChapters() {
        return totalChapters;
    }

    public Integer getTotalVolumes() {
        return totalVolumes;
    }

    public Integer getPublishingStatus() {
        return publishingStatus;
    }

    public Boolean isRereading() {
        return isRereading;
    }

    public @Nullable String getTags() {
        return tags;
    }

    public @Nullable LocalDateTime getStartDate() {
        return startDate;
    }

    public @Nullable LocalDateTime getEndDate() {
        return endDate;
    }

    public @Nullable LocalDateTime getReadStartDate() {
        return readStartDate;
    }

    public @Nullable LocalDateTime getReadEndDate() {
        return readEndDate;
    }

    public @Nullable String getDays() {
        return days;
    }

    public @Nullable String getRetail() {
        return retail;
    }

    public String getPriority() {
        return priority;
    }

    public Boolean addedToList() {
        return addedToList;
    }

    public List<MagazineMeta> getMagazines() {
        return magazines;
    }

}
