package com.schalar.jikan.model.anime;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

@Generated
public class AnimeStats extends Model {

    public AnimeStats() {
        addCustomFunctionForField("scores", o -> {
            Map<Integer, Score> map = new HashMap<>();
            JSONObject jsonObject = (JSONObject) o;
            jsonObject.keySet().forEach(s -> map.put(Integer.parseInt(s), new Score(jsonObject.getJSONObject(s))));
            return map;
        });
    }

    private Integer watching;

    private Integer completed;

    private Integer onHold;

    private Integer dropped;

    private Integer planToWatch;

    private Integer total;

    private Map<Integer, Score> scores;

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


    public Integer getTotal() {
        return total;
    }

    public Map<Integer, Score> getScores() {
        return scores;
    }

    public static class Score {
        private final Integer votes;
        private final Double percentage;

        public Score(@NotNull JSONObject jsonObject) {
            this.votes = jsonObject.getInt("votes");
            this.percentage = jsonObject.getDouble("percentage");
        }

        @Override
        public String toString() {
            return "[" + "votes=" + votes + ", percentage=" + percentage + ']';
        }

        public Integer getVotes() {
            return votes;
        }

        public Double getPercentage() {
            return percentage;
        }

    }

}
