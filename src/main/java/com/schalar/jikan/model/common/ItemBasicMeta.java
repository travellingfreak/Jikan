package com.schalar.jikan.model.common;

import com.schalar.jikan.model.Model;
import org.json.JSONObject;

public class ItemBasicMeta extends Model {

    protected final Integer malId;

    protected final String name;

    public ItemBasicMeta(JSONObject object) {
        this.malId = object.getInt("mal_id");
        this.name = object.getString("name");
    }

    public Integer getMalId() {
        return malId;
    }

    public String getTitle() {
        return name;
    }

    public String getName() {
        return name;
    }

}
