package com.schalar.jikan.model.producer;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MalUrl;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class Producer extends Model {

    public Producer() {
        addCustomFunctionForField("anime", o -> {
            List<ProducerAnime> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new ProducerAnime((JSONObject) o1)));
            return list;
        });
    }

    public MalUrl malUrl;

    public List<ProducerAnime> anime;

    public MalUrl getMalUrl() {
        return malUrl;
    }

    public List<ProducerAnime> getAnime() {
        return anime;
    }

}
