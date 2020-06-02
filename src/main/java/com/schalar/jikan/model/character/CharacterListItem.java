package com.schalar.jikan.model.character;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CharacterListItem extends Model {

    public final Integer malId;

    public final String url;

    public final String imageUrl;
    
    public final String name;

    public final String role;

    public final List<VoiceActor> voiceActors = new ArrayList<>();

    public CharacterListItem(@NotNull JSONObject jsonObject) {
        this.role = jsonObject.getString("role");
        jsonObject.getJSONArray("voice_actors").forEach(o -> {
            JSONObject jsonObject1 = (JSONObject) o;
            voiceActors.add(new VoiceActor(jsonObject1));
        });
        this.imageUrl = jsonObject.getString("image_url");
        this.name = jsonObject.getString("name");
        this.malId = jsonObject.getInt("mal_id");
        this.url = jsonObject.getString("url");
    }

    @Override
    public String toString() {
        return this.name;
    }

    public Integer getMalId() {
        return malId;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<VoiceActor> getVoiceActors() {
        return voiceActors;
    }

}
