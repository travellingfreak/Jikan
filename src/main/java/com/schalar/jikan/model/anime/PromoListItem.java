package com.schalar.jikan.model.anime;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class PromoListItem extends Model {

    private final String title;

    private final String imageUrl;

    private final String videoUrl;

    public PromoListItem(@NotNull JSONObject jsonObject) {
        this.videoUrl = jsonObject.getString("video_url");
        this.imageUrl = jsonObject.getString("image_url");
        this.title = jsonObject.getString("title");
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

}
