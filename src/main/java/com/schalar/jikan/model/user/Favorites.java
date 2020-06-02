package com.schalar.jikan.model.user;

import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MalUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Favorites extends Model {

    private final List<MalUrl> anime = new ArrayList<>();

    private final List<MalUrl> manga = new ArrayList<>();

    private final List<MalUrl> characters = new ArrayList<>();

    private final List<MalUrl> people = new ArrayList<>();

    public Favorites(@NotNull JSONObject jsonObject) {
        jsonObject.getJSONArray("characters").forEach(o -> {
            JSONObject object = (JSONObject) o;
            this.characters.add(new MalUrl(object.getString("name"), object.getString("url")));
        });

        jsonObject.getJSONArray("manga").forEach(o -> {
            JSONObject object = (JSONObject) o;
            this.manga.add(new MalUrl(object.getString("name"), object.getString("url")));
        });

        jsonObject.getJSONArray("people").forEach(o -> {
            JSONObject object = (JSONObject) o;
            this.people.add(new MalUrl(object.getString("name"), object.getString("url")));
        });

        jsonObject.getJSONArray("anime").forEach(o -> {
            JSONObject object = (JSONObject) o;
            this.anime.add(new MalUrl(object.getString("name"), object.getString("url")));
        });
    }

    public List<MalUrl> getAnime() {
        return anime;
    }

    public List<MalUrl> getManga() {
        return manga;
    }

    public List<MalUrl> getCharacters() {
        return characters;
    }

    public List<MalUrl> getPeople() {
        return people;
    }

}
