package com.schalar.jikan.model.anime;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.character.CharacterListItem;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class AnimeCharactersAndStaff extends Model {

    public AnimeCharactersAndStaff() {
        addCustomFunctionForField("characters", o -> {
            List<CharacterListItem> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new CharacterListItem((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("staff", o -> {
            List<StaffListItem> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new StaffListItem((JSONObject) o1)));
            return list;
        });
    }

    private List<CharacterListItem> characters;

    private List<StaffListItem> staff;

    public List<CharacterListItem> getCharacters() {
        return characters;
    }

    public List<StaffListItem> getStaff() {
        return staff;
    }

}
