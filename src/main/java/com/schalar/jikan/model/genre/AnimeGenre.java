package com.schalar.jikan.model.genre;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.AnimeCard;
import com.schalar.jikan.model.common.MalUrl;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class AnimeGenre extends Model {

    public AnimeGenre() {
        addCustomFunctionForField("malUrl", o -> {
            JSONObject jsonObject = (JSONObject) o;
            return new MalUrl(jsonObject.getString("name"), jsonObject.getString("url"));
        });
        addCustomFunctionForField("anime", o -> {
            List<AnimeCard> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new AnimeCard((JSONObject) o1)));
            return list;
        });
    }

    public MalUrl malUrl;

    public Integer itemCount;

    public List<AnimeCard> anime;

    public MalUrl getMalUrl() {
        return malUrl;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public List<AnimeCard> getAnime() {
        return anime;
    }

}
