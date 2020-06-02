package com.schalar.jikan.model.person;

import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MangaMeta;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class PublishedManga extends Model {

    private final String position;

    private final MangaMeta mangaMeta;

    public PublishedManga(@NotNull JSONObject jsonObject) {
        this.mangaMeta = new MangaMeta(jsonObject.getJSONObject("manga"));
        this.position = jsonObject.getString("position");
    }

    public String getPosition() {
        return position;
    }

    public MangaMeta getMangaMeta() {
        return mangaMeta;
    }

}
