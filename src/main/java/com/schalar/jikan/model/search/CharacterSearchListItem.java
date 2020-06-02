package com.schalar.jikan.model.search;

import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MalUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CharacterSearchListItem extends Model {

    private final Integer malId;

    private final String url;

    private final String imageUrl;

    private final String name;

    private final List<String> alternativeNames = new ArrayList<>();

    private final List<MalUrl> anime;

    private final List<MalUrl> manga;

    public CharacterSearchListItem(@NotNull JSONObject object) {
        this.imageUrl = object.getString("image_url");
        this.name = object.getString("name");
        this.manga = (List<MalUrl>) buildUrlList().apply(object.getJSONArray("manga"));
        this.malId = object.getInt("mal_id");
        object.getJSONArray("alternative_names").forEach(o -> this.alternativeNames.add((String) o));
        this.url = object.getString("url");
        this.anime = (List<MalUrl>) buildUrlList().apply(object.getJSONArray("anime"));
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

    public List<String> getAlternativeNames() {
        return alternativeNames;
    }

    public List<MalUrl> getAnime() {
        return anime;
    }

    public List<MalUrl> getManga() {
        return manga;
    }

}
