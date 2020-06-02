package com.schalar.jikan.model.manga;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class MangaReviewScores extends Model {

    private final Integer overall;

    private final Integer story;
    
    private final Integer art;
    
    private final Integer character;

    private final Integer enjoyment;

    public MangaReviewScores(@NotNull JSONObject object) {
        this.art = object.getInt("art");
        this.character = object.getInt("character");
        this.enjoyment = object.getInt("enjoyment");
        this.overall = object.getInt("overall");
        this.story = object.getInt("story");
    }

    public Integer getOverall() {
        return this.overall;
    }
    
    public Integer getStory() {
        return this.story;
    }
    
    public Integer getArt() {
        return this.art;
    }

    public Integer getCharacter() {
        return this.character;
    }
    
    public Integer getEnjoyment() {
        return this.enjoyment;
    }

}
