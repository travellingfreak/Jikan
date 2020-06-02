package com.schalar.jikan.model.genre;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MalUrl;
import com.schalar.jikan.model.common.MangaCard;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class MangaGenre extends Model {

    public MangaGenre() {
        addCustomFunctionForField("malUrl", o -> {
            JSONObject jsonObject = (JSONObject) o;
            return new MalUrl(jsonObject.getString("name"), jsonObject.getString("url"));
        });
        addCustomFunctionForField("manga", o -> {
            List<MangaCard> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new MangaCard((JSONObject) o1)));
            return list;
        });
    }

    public MalUrl malUrl;

    public Integer itemCount;

    public List<MangaCard> manga;

    public MalUrl getMalUrl() {
        return malUrl;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public List<MangaCard> getManga() {
        return manga;
    }

}
