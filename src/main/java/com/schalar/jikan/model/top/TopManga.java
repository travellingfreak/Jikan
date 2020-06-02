package com.schalar.jikan.model.top;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.Nullable;

@Generated(list = true)
public class TopManga extends Model {

    private Integer malId;

    private Integer rank;

    private String title;

    private String url;

    private String type;

    @Nullable
    private Integer volumes;

    private String startDate;

    private String endDate;

    private Integer members;

    private Number score;

    private String imageUrl;

    @Override
    public String toString() {
        return this.getTitle();
    }

    public Integer getRank() {
        return rank;
    }

    public Integer getMalId() {
        return malId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }

    @Nullable
    public Integer getVolumes() {
        return volumes;
    }

    @Nullable
    public String getStartDate() {
        return startDate;
    }

    @Nullable
    public String getEndDate() {
        return endDate;
    }

    public Integer getMembers() {
        return members;
    }

    public Number getScore() {
        return score;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
