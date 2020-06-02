package com.schalar.jikan.model.search;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class CharacterSearch extends Model {

    public CharacterSearch() {
        addCustomFunctionForField("results", o -> {
            List<CharacterSearchListItem> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(object -> list.add(new CharacterSearchListItem((JSONObject) object)));
            return list;
        });
    }

    private List<CharacterSearchListItem> results;

    private Integer lastPage;

    public List<CharacterSearchListItem> getResults() {
        return results;
    }

    public Integer getLastPage() {
        return lastPage;
    }

}
