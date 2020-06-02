package com.schalar.jikan.model.anime;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.util.List;

public class StaffListItem extends Model {

    public final Integer malId;

    public final String url;

    public final String name;

    public final String imageUrl;

    public final List<String> positions;

    public StaffListItem(@NotNull JSONObject jsonObject) {
        this.imageUrl = jsonObject.getString("image_url");
        this.name = jsonObject.getString("name");
        this.positions = (List<String>) buildStringList().apply(jsonObject.getJSONArray("positions"));
        this.malId = jsonObject.getInt("mal_id");
        this.url = jsonObject.getString("url");
    }

    public Integer getMalId() {
        return malId;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public List<String> getPositions() {
        return positions;
    }

}
