package com.schalar.jikan.model.seasonal;

import com.schalar.jikan.model.common.AnimeCard;
import org.json.JSONObject;

public class SeasonalAnime extends AnimeCard {

    protected final Boolean continuing;

    public SeasonalAnime(JSONObject jsonObject) {
        super(jsonObject);
        this.continuing = jsonObject.getBoolean("continuing");
    }

    public Boolean isContinuing() {
        return continuing;
    }

}
