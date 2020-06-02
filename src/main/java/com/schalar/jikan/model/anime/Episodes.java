package com.schalar.jikan.model.anime;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class Episodes extends Model {

    public Episodes() {
        addCustomFunctionForField("episodes", o -> {
            List<EpisodeListItem> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new EpisodeListItem((JSONObject) o1)));
            return list;
        });
    }

    private Integer episodesLastPage;

    private List<EpisodeListItem> episodes;

    public List<EpisodeListItem> getEpisodes() {
        return episodes;
    }

    public Integer getEpisodesLastPage() {
        return episodesLastPage;
    }

}
