package com.schalar.jikan.model.search;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class AnimeSearch extends Model {

    public AnimeSearch() {
        addCustomFunctionForField("results", o -> {
            List<AnimeSearchListItem> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(object -> list.add(new AnimeSearchListItem((JSONObject) object)));
            return list;
        });
    }

    private List<AnimeSearchListItem> results;

    private Integer lastPage;

    public List<AnimeSearchListItem> getResults() {
        return results;
    }

    public Integer getLastPage() {
        return lastPage;
    }

}
