package com.schalar.jikan.model.manga;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.json.JSONObject;

import java.time.LocalDateTime;

@Generated(list = true)
public class MangaReview extends Model {

    public MangaReview() {
        addCustomFunctionForField("date", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("reviewer", o -> new MangaReviewer((JSONObject) o));
    }

    private Integer malId;

    private String url;

    private Integer helpfulCount;

    private LocalDateTime date;

    private MangaReviewer reviewer;

    private String content;

    public Integer getMalId() {
        return malId;
    }

    public String getUrl() {
        return url;
    }

    public Integer getHelpfulCount() {
        return helpfulCount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public MangaReviewer getReviewer() {
        return reviewer;
    }

    public String getContent() {
        return content;
    }

}
