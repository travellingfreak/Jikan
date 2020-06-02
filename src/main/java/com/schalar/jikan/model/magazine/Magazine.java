package com.schalar.jikan.model.magazine;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MalUrl;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class Magazine extends Model {

    public Magazine() {
        addCustomFunctionForField("manga", o -> {
            List<MagazineManga> list = new ArrayList<>();
            ((JSONArray) o).forEach(o1 -> list.add(new MagazineManga((JSONObject) o1)));
            return list;
        });
    }

    public MalUrl malUrl;

    public List<MagazineManga> manga;

    public MalUrl getMalUrl() {
        return malUrl;
    }

    public List<MagazineManga> getManga() {
        return manga;
    }

}
