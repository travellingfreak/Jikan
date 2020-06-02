package com.schalar.jikan.model.search;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class PersonSearch extends Model {

    public PersonSearch() {
        addCustomFunctionForField("results", o -> {
            List<PersonSearchListItem> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(object -> list.add(new PersonSearchListItem((JSONObject) object)));
            return list;
        });
    }

    private List<PersonSearchListItem> results;

    private Integer lastPage;

    public List<PersonSearchListItem> getResults() {
        return results;
    }

    public Integer getLastPage() {
        return lastPage;
    }

}
