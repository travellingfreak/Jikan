package com.schalar.jikan.model.seasonal;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class Seasonal extends Model {

    public Seasonal() {
        addCustomFunctionForField("anime", o -> {
            JSONArray jsonArray = (JSONArray) o;
            List<SeasonalAnime> list = new ArrayList<>();
            jsonArray.forEach(o1 -> list.add(new SeasonalAnime((JSONObject) o1)));
            return list;
        });
    }

    public String seasonName;

    public Integer seasonYear;

    public List<SeasonalAnime> anime;

    public String getSeason() {
        return String.format("%s %s", this.seasonName, this.seasonYear);
    }

    public Integer getSeasonYear() {
        return seasonYear;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public List<SeasonalAnime> getAnime() {
        return anime;
    }

}
