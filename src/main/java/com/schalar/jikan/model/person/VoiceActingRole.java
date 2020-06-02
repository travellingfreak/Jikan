package com.schalar.jikan.model.person;

import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.AnimeMeta;
import com.schalar.jikan.model.common.CharacterMeta;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class VoiceActingRole extends Model {

    private final String role;

    private final AnimeMeta animeMeta;

    private final CharacterMeta characterMeta;

    public VoiceActingRole(@NotNull JSONObject jsonObject) {
        this.characterMeta = new CharacterMeta(jsonObject.getJSONObject("character"));
        this.role = jsonObject.getString("role");
        this.animeMeta = new AnimeMeta(jsonObject.getJSONObject("anime"));
    }

    public String getRole() {
        return role;
    }

    public AnimeMeta getAnimeMeta() {
        return animeMeta;
    }

    public CharacterMeta getCharacterMeta() {
        return characterMeta;
    }
    
}
