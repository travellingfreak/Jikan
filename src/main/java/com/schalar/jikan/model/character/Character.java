package com.schalar.jikan.model.character;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/*
 *  TODO: Fix \n formatting issue.
 */
@Generated
public class Character extends Model {

    public Character() {
        addCustomFunctionForField("animeography", o -> {
            JSONArray jsonArray = (JSONArray) o;
            List<Animeography> list = new ArrayList<>();
            jsonArray.forEach(o1 -> list.add(new Animeography((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("mangaography", o -> {
            JSONArray jsonArray = (JSONArray) o;
            List<Mangaography> list = new ArrayList<>();
            jsonArray.forEach(o1 -> list.add(new Mangaography((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("voiceActors", o -> {
            JSONArray jsonArray = (JSONArray) o;
            List<VoiceActor> list = new ArrayList<>();
            jsonArray.forEach(o1 -> list.add(new VoiceActor((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("nicknames", buildStringList());
    }

    private Integer malId;

    private String url;

    private String name;

    private String nameKanji;

    private List<String> nicknames;

    private String about;

    private Integer memberFavorites;

    private String imageUrl;

    public List<Animeography> animeography;

    public List<Mangaography> mangaography;

    public List<VoiceActor> voiceActors;

    public Integer getMalId() {
        return malId;
    }

    public String getCharacterUrl() {
        return this.url;
    }

    public String getName() {
        return name;
    }

    @Nullable
    public String getNameKanji() {
        return nameKanji;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    public String getAbout() {
        return about;
    }

    public Integer getMemberFavorites() {
        return memberFavorites;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<Animeography> getAnimeography() {
        return animeography;
    }

    public List<Mangaography> getMangaography() {
        return mangaography;
    }

    public List<VoiceActor> getVoiceActors() {
        return voiceActors;
    }

}
