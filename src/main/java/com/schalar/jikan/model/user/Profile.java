package com.schalar.jikan.model.user;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.time.LocalDateTime;

@Generated
public class Profile extends Model {

    public Profile() {
        addCustomFunctionForField("animeStats", o -> new UserAnimeStats((JSONObject) o));
        addCustomFunctionForField("mangaStats", o -> new UserMangaStats((JSONObject) o));
        addCustomFunctionForField("favorites", o -> new Favorites((JSONObject) o));
        addCustomFunctionForField("lastOnline", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("birthday", o -> o == JSONObject.NULL ? null : LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("joined", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
    }

    private String username;

    private String url;

    private String imageUrl;

    private LocalDateTime lastOnline;

    private String gender;

    private LocalDateTime birthday;

    private String location;

    private LocalDateTime joined;

    private UserAnimeStats animeStats;

    private UserMangaStats mangaStats;

    private Favorites favorites;

    private String about;

    public String getUsername() {
        return username;
    }

    public LocalDateTime getLastOnline() {
        return lastOnline;
    }

    @Nullable
    public String getGender() {
        return gender;
    }

    @Nullable
    public LocalDateTime getBirthday() {
        return birthday;
    }

    public String getLocation() {
        return location;
    }

    @Nullable
    public LocalDateTime getJoined() {
        return joined;
    }

    public UserAnimeStats getAnimeStats() {
        return animeStats;
    }

    public UserMangaStats getMangaStats() {
        return mangaStats;
    }

    public Favorites getFavorites() {
        return favorites;
    }

    @Nullable
    public String getAbout() {
        return about;
    }

    public String getUrl() {
        return url;
    }

    @Nullable
    public String getImageUrl() {
        return imageUrl;
    }

}
