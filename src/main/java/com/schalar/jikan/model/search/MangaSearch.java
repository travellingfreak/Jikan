package com.schalar.jikan.model.search;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class MangaSearch extends Model {

    public MangaSearch() {
        addCustomFunctionForField("results", o -> {
            List<MangaSearchListItem> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(object -> list.add(new MangaSearchListItem((JSONObject) object)));
            return list;
        });
    }

    private List<MangaSearchListItem> results;

    private Integer lastPage;

    public List<MangaSearchListItem> getResults() {
        return results;
    }

    public Integer getLastPage() {
        return lastPage;
    }

}
