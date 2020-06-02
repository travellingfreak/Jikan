package com.schalar.jikan.model.common;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;

@Generated(list = true)
public class Recommendation extends Model {

    private Integer malId;

    private String url;

    private String imageUrl;

    private String recommendationUrl;

    private String title;

    private Integer recommendationCount;

    public Integer getMalId() {
        return malId;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getRecommendationUrl() {
        return recommendationUrl;
    }

    public String getTitle() {
        return title;
    }

    public Integer getRecommendationCount() {
        return recommendationCount;
    }

}
