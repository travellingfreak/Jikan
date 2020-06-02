package com.schalar.jikan.model.manga;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.anime.AnimeStats.Score;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

@Generated
public class MangaStats extends Model {

    public MangaStats() {
        addCustomFunctionForField("scores", o -> {
            Map<Integer, Score> map = new HashMap<>();
            JSONObject jsonObject = (JSONObject) o;
            jsonObject.keySet().forEach(s -> map.put(Integer.parseInt(s), new Score(jsonObject.getJSONObject(s))));
            return map;
        });
    }

    private Integer reading;

    private Integer completed;

    private Integer onHold;

    private Integer dropped;

    private Integer planToRead;

    private Integer total;

    private Map<Integer, Score> scores;

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

    public Integer getTotal() {
        return total;
    }

    public Map<Integer, Score> getScores() {
        return scores;
    }

}
