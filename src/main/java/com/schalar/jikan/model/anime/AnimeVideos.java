package com.schalar.jikan.model.anime;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class AnimeVideos extends Model {

    public AnimeVideos() {
        addCustomFunctionForField("promo", o -> {
            List<PromoListItem> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new PromoListItem((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("episodes", o -> {
            List<StreamEpisodeListItem> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new StreamEpisodeListItem((JSONObject) o1)));
            return list;
        });
    }

    private List<PromoListItem> promo;

    private List<StreamEpisodeListItem> episodes;

    public List<PromoListItem> getPromos() {
        return promo;
    }

    public List<StreamEpisodeListItem> getEpisodes() {
        return episodes;
    }

}
