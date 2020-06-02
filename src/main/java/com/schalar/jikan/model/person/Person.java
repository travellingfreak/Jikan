package com.schalar.jikan.model.person;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
 *  TODO: Fix \n formatting issue.
 */
@Generated
public class Person extends Model {

    public Person() {
        addCustomFunctionForField("alternateNames", buildStringList());
        addCustomFunctionForField("voiceActingRoles", o -> {
            JSONArray jsonArray = (JSONArray) o;
            List<VoiceActingRole> list = new ArrayList<>();
            jsonArray.forEach(o1 -> list.add(new VoiceActingRole((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("animeStaffPositions", o -> {
            JSONArray jsonArray = (JSONArray) o;
            List<AnimeStaffPosition> list = new ArrayList<>();
            jsonArray.forEach(o1 -> list.add(new AnimeStaffPosition((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("publishedManga", o -> {
            JSONArray jsonArray = (JSONArray) o;
            List<PublishedManga> list = new ArrayList<>();
            jsonArray.forEach(o1 -> list.add(new PublishedManga((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("birthday", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
    }

    private Integer malId;

    private String url;

    private String imageUrl;

    private String websiteUrl;

    private String name;

    private String givenName;

    private String familyName;

    private List<String> alternateNames;

    private LocalDateTime birthday;

    private Integer memberFavorites;

    private String about;

    private List<VoiceActingRole> voiceActingRoles;

    private List<AnimeStaffPosition> animeStaffPositions;

    private List<PublishedManga> publishedManga;

    public Integer getMalId() {
        return malId;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Nullable
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getName() {
        return name;
    }

    @Nullable
    public String getGivenName() {
        return givenName;
    }

    @Nullable
    public String getFamilyName() {
        return familyName;
    }

    public List<String> getAlternateNames() {
        return alternateNames;
    }

    @Nullable
    public LocalDateTime getBirthday() {
        return birthday;
    }

    public Integer getMemberFavorites() {
        return memberFavorites;
    }

    @Nullable
    public String getAbout() {
        return about;
    }

    public List<VoiceActingRole> getVoiceActingRoles() {
        return voiceActingRoles;
    }

    public void setVoiceActingRoles(List<VoiceActingRole> list) {
        this.voiceActingRoles = list;
    }

    public List<AnimeStaffPosition> getAnimeStaffPositions() {
        return animeStaffPositions;
    }

    public void setAnimeStaffPositions(List<AnimeStaffPosition> list) {
        this.animeStaffPositions = list;
    }

    public List<PublishedManga> getPublishedManga() {
        return publishedManga;
    }

    public void setPublishedManga(List<PublishedManga> list) {
        this.publishedManga = list;
    }

}
