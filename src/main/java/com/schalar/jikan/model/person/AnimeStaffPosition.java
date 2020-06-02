package com.schalar.jikan.model.person;

import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.AnimeMeta;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class AnimeStaffPosition extends Model {

    private final String position;

    private final AnimeMeta animeMeta;

    public AnimeStaffPosition(@NotNull JSONObject jsonObject) {
        this.position = jsonObject.getString("position");
        this.animeMeta = new AnimeMeta(jsonObject.getJSONObject("anime"));
    }

    public String getPosition() {
        return position;
    }

    public AnimeMeta getAnimeMeta() {
        return animeMeta;
    }

}
