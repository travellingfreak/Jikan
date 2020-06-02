package com.schalar.jikan.model.anime;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MalUrl;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Generated
public class Anime extends Model {

    public Anime() {
        this.addCustomFunctionForField("titleSynonyms", buildStringList());
        this.addCustomFunctionForField("aired", buildDateMap());
        this.addCustomFunctionForField("related", object -> {
            JSONObject jsonObject = (JSONObject) object;
            Map<String, List<MalUrl>> map = new HashMap<>();
            jsonObject.keys().forEachRemaining(key -> {
                List<MalUrl> list = new ArrayList<>();
                jsonObject.getJSONArray(key).forEach(o -> {
                    JSONObject jso = (JSONObject) o;
                    list.add(new MalUrl(jso.getString("name"), jso.getString("url")));
                });
                map.put(key, list);
            });
            return map;
        });
        this.addCustomFunctionForField("producers", buildUrlList());
        this.addCustomFunctionForField("licensors", buildUrlList());
        this.addCustomFunctionForField("studios", buildUrlList());
        this.addCustomFunctionForField("genres", buildUrlList());
        this.addCustomFunctionForField("openingThemes", buildStringList());
        this.addCustomFunctionForField("endingThemes", buildStringList());
    }

    private Integer malId;

    private String url;

    private String imageUrl;

    @Nullable
    private String trailerUrl;

    private String title;

    @Nullable
    private String titleEnglish;

    @Nullable
    private String titleJapanese;

    private List<String> titleSynonyms;

    @Nullable
    private String type;

    @Nullable
    private String source;

    @Nullable
    private Integer episodes;

    @Nullable
    private String status;

    private Boolean airing = false;

    private Map<String, LocalDateTime> aired;

    @Nullable
    private String duration;

    @Nullable
    private String rating;

    @Nullable
    private Double score;

    @Nullable
    private Integer scoredBy;

    @Nullable
    private Integer rank;

    @Nullable
    private Integer popularity;

    @Nullable
    private Integer members;

    @Nullable
    private Integer favorites;

    @Nullable
    private String synopsis;

    @Nullable
    private String background;

    @Nullable
    private String premiered;

    @Nullable
    private String broadcast;

    private Map<String, List<MalUrl>> related;

    private List<MalUrl> producers;

    private List<MalUrl> licensors;

    private List<MalUrl> studios;

    private List<MalUrl> genres;

    private List<String> openingThemes;

    private List<String> endingThemes;

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

    @Nullable
    public String getTitleJapanese() {
        return titleJapanese;
    }

    public List<String> getTitleSynonyms() {
        return titleSynonyms;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Nullable
    public String getTrailerUrl() {
        return trailerUrl;
    }

    @Nullable
    public String getType() {
        return type;
    }

    @Nullable
    public String getSource() {
        return source;
    }

    @Nullable
    public Integer getEpisodes() {
        return episodes;
    }
    @Nullable
    public String getStatus() {
        return status;
    }

    public Boolean isAiring() {
        return airing;
    }

    public Map<String, LocalDateTime> getAired() {
        return aired;
    }

    public @Nullable String getDuration() {
        return duration;
    }

    @Nullable
    public String getRating() {
        return rating;
    }

    @Nullable
    public Double getScore() {
        return score;
    }

    @Nullable
    public Integer getScoredBy() {
        return scoredBy;
    }

    @Nullable
    public Integer getRank() {
        return rank;
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

    @Nullable
    public String getPremiered() {
        return premiered;
    }

    @Nullable
    public String getBroadcast() {
        return broadcast;
    }

    public Map<String, List<MalUrl>> getRelated() {
        return related;
    }

    public List<MalUrl> getProducers() {
        return producers;
    }

    public List<MalUrl> getLicensors() {
        return licensors;
    }

    public List<MalUrl> getStudios() {
        return studios;
    }

    public List<MalUrl> getGenres() {
        return genres;
    }

    public List<String> getOpeningThemes() {
        return openingThemes;
    }

    public List<String> getEndingThemes() {
        return endingThemes;
    }

}