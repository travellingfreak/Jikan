package com.schalar.jikan.model.common;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class ItemMeta extends Model {

    private final Integer malId;

    private final String url;

    private final String imageUrl;

    private final String name;

    public ItemMeta(@NotNull JSONObject jsonObject) {
        this.imageUrl = jsonObject.getString("image_url");
        this.name = jsonObject.getString("name");
        this.malId = jsonObject.getInt("mal_id");
        this.url = jsonObject.getString("url");
    }

    @Override
    public String toString() {
        return this.name;
    }

    public Integer getMalId() {
        return malId;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

}
