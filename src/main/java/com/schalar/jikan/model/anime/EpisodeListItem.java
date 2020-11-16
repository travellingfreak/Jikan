package com.schalar.jikan.model.anime;

import com.schalar.jikan.model.Model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.time.LocalDateTime;

public class EpisodeListItem extends Model {

    private final Integer episodeId;

    private final String title;

    private final String titleJapanese;

    private final String titleRomanji;

    private final LocalDateTime aired;

    private final Boolean filler;

    private final Boolean recap;

    private final String videoUrl;

    private final String forumUrl;

    public EpisodeListItem(@NotNull JSONObject jsonObject) {
        this.titleJapanese = jsonObject.optString("title_japanese", null);
        this.forumUrl = jsonObject.getString("forum_url");
        if (jsonObject.isNull("aired")) {
            this.aired = null;
        } else {
            this.aired = LocalDateTime.parse(jsonObject.getString("aired").replace("+00:00", ""));
        }
        this.episodeId = jsonObject.getInt("episode_id");
        this.titleRomanji = jsonObject.optString("title_romanji", null);
        this.videoUrl = jsonObject.optString("video_url", null);
        this.filler = jsonObject.getBoolean("filler");
        this.recap = jsonObject.getBoolean("recap");
        this.title = jsonObject.getString("title");
    }

    public Integer getEpisodeId() {
        return episodeId;
    }

    public String getTitle() {
        return title;
    }

    @Nullable
    public String getTitleJapanese() {
        return titleJapanese;
    }

    @Nullable
    public String getTitleRomanji() {
        return titleRomanji;
    }

    @Nullable
    public LocalDateTime getAired() {
        return aired;
    }

    public Boolean isFiller() {
        return filler;
    }

    public Boolean isRecap() {
        return recap;
    }

    @Nullable
    public String getVideoUrl() {
        return videoUrl;
    }

    public String getForumUrl() {
        return forumUrl;
    }

}
