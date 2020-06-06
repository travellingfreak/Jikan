package com.schalar.jikan.model.manga;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MalUrl;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Generated
public class Manga extends Model {

    public Manga() {
        addCustomFunctionForField("titleSynonyms", buildStringList());
        addCustomFunctionForField("published", buildDateMap());
        addCustomFunctionForField("related", o -> {
            Map<String, List<MalUrl>> map = new HashMap<>();
            JSONObject jsonObject = (JSONObject) o;
            jsonObject.keySet().forEach(key -> {
                List<MalUrl> list = (List<MalUrl>) buildUrlList().apply(jsonObject.getJSONArray(key));
                map.put(key, list);
            });
            return map;
        });
        addCustomFunctionForField("genres", buildUrlList());
        addCustomFunctionForField("authors", buildUrlList());
        addCustomFunctionForField("serializations", buildUrlList());
    }

    private Integer malId;

    private String url;

    private String title;

    private String titleEnglish;

    private List<String> titleSynonyms;

    private String titleJapanese;

    private String status;

    private String imageUrl;

    private String type;

    private Integer volumes;

    private Integer chapters;

    private Boolean publishing = false;

    private Map<String, LocalDateTime> published;

    private Integer rank;

    private Double score;

    private Integer scoredBy;

    private Integer popularity;

    private Integer members;

    private Integer favorites;

    private String synopsis;

    private String background;

    private Map<String, List<MalUrl>> related;

    private List<MalUrl> genres;

    private List<MalUrl> authors;

    private List<MalUrl> serializations;

    public Integer getMalId() {
        return malId;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    @Nullable
    public String getTitleEnglish() {
        return titleEnglish;
    }

    public List<String> getTitleSynonyms() {
        return titleSynonyms;
    }

    @Nullable
    public String getTitleJapanese() {
        return titleJapanese;
    }

    @Nullable
    public String getStatus() {
        return status;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Nullable
    public String getType() {
        return type;
    }

    @Nullable
    public Integer getVolumes() {
        return volumes;
    }

    @Nullable
    public Integer getChapters() {
        return chapters;
    }

    public Boolean isPublishing() {
        return publishing;
    }

    public Map<String, LocalDateTime> getPublished() {
        return published;
    }

    @Nullable
    public Integer getRank() {
        return rank;
    }

    @Nullable
    public Double getScore() {
        return score;
    }

    public Integer getScoredBy() {
        return scoredBy;
    }

    @Nullable
    public Integer getPopularity() {
        return popularity;
    }

    @Nullable
    public Integer getMembers() {
        return members;
    }

    @Nullable
    public Integer getFavorites() {
        return favorites;
    }

    @Nullable
    public String getSynopsis() {
        return synopsis;
    }

    @Nullable
    public String getBackground() {
        return background;
    }

    public Map<String, List<MalUrl>> getRelated() {
        return related;
    }

    public List<MalUrl> getGenres() {
        return genres;
    }

    public List<MalUrl> getAuthors() {
        return authors;
    }

    public List<MalUrl> getSerializations() {
        return serializations;
    }

}
