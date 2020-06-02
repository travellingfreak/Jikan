package com.schalar.jikan.model.anime;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class StreamEpisodeListItem extends Model {

    private final String title;

    private final String episode;

    private final String url;

    private final String imageUrl;

    public StreamEpisodeListItem(@NotNull JSONObject jsonObject) {
        this.imageUrl = jsonObject.getString("image_url");
        this.episode = jsonObject.getString("episode");
        this.title = jsonObject.getString("title");
        this.url = jsonObject.getString("url");
    }

    public String getTitle() {
        return title;
    }

    public String getEpisode() {
        return episode;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
