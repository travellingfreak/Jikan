package com.schalar.jikan.model.character;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class VoiceActor extends Model {

    private final Integer malId;

    private final String name;

    private final String url;

    private final String imageUrl;

    private final String language;

    public VoiceActor(@NotNull JSONObject jsonObject) {
        this.imageUrl = jsonObject.getString("image_url");
        this.name = jsonObject.getString("name");
        this.language = jsonObject.getString("language");
        this.malId = jsonObject.getInt("mal_id");
        this.url = jsonObject.getString("url");
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public String getName() {
        return name;
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

    public String getLanguage() {
        return language;
    }

}
