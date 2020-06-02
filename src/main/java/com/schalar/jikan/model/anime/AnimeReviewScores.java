package com.schalar.jikan.model.anime;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class AnimeReviewScores extends Model {

    private final Integer overall;

    private final Integer story;

    private final Integer animation;

    private final Integer sound;

    private final Integer character;

    private final Integer enjoyment;

    public AnimeReviewScores(@NotNull JSONObject object) {
        this.character = object.getInt("character");
        this.enjoyment = object.getInt("enjoyment");
        this.sound = object.getInt("sound");
        this.overall = object.getInt("overall");
        this.story = object.getInt("story");
        this.animation = object.getInt("animation");
    }

    public Integer getOverall() {
        return this.overall;
    }
    
    public Integer getStory() {
        return this.story;
    }
    
    public Integer getAnimation() {
        return this.animation;
    }

    public Integer getSound() {
        return this.sound;
    }
    
    public Integer getCharacter() {
        return this.character;
    }
    
    public Integer getEnjoyment() {
        return this.enjoyment;
    }
    
}
