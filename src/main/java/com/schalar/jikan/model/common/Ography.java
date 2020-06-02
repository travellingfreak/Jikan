package com.schalar.jikan.model.common;

import com.schalar.jikan.model.Model;
import org.json.JSONObject;

public abstract class Ography extends Model {

    private final Integer malId;

    private final String name;

    private final String url;

    private final String imageUrl;

    private final String role;

    public Ography(JSONObject jsonObject) {
        this.role = jsonObject.getString("role");
        this.imageUrl = jsonObject.getString("image_url");
        this.name = jsonObject.getString("name");
        this.malId = jsonObject.getInt("mal_id");
        this.url = jsonObject.getString("url");
    }

    public Integer getMalId() {
        return malId;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getRole() {
        return role;
    }

}
