package com.schalar.jikan.model.schedule;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.AnimeCard;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Generated
public class Schedule extends Model {

    public Schedule() {
        addCustomFunctionForField("monday", o -> {
            List<AnimeCard> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new AnimeCard((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("tuesday", o -> {
            List<AnimeCard> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new AnimeCard((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("wednesday", o -> {
            List<AnimeCard> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new AnimeCard((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("thursday", o -> {
            List<AnimeCard> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new AnimeCard((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("friday", o -> {
            List<AnimeCard> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new AnimeCard((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("saturday", o -> {
            List<AnimeCard> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new AnimeCard((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("sunday", o -> {
            List<AnimeCard> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new AnimeCard((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("other", o -> {
            List<AnimeCard> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new AnimeCard((JSONObject) o1)));
            return list;
        });
        addCustomFunctionForField("unknown", o -> {
            List<AnimeCard> list = new ArrayList<>();
            JSONArray jsonArray = (JSONArray) o;
            jsonArray.forEach(o1 -> list.add(new AnimeCard((JSONObject) o1)));
            return list;
        });
    }

    public List<AnimeCard> monday;

    public List<AnimeCard> tuesday;

    public List<AnimeCard> wednesday;

    public List<AnimeCard> thursday;

    public List<AnimeCard> friday;

    public List<AnimeCard> saturday;

    public List<AnimeCard> sunday;

    public List<AnimeCard> other;

    public List<AnimeCard> unknown;

    public List<AnimeCard> getMonday() {
        return monday;
    }

    public List<AnimeCard> getTuesday() {
        return tuesday;
    }

    public List<AnimeCard> getWednesday() {
        return wednesday;
    }

    public List<AnimeCard> getThursday() {
        return thursday;
    }

    public List<AnimeCard> getFriday() {
        return friday;
    }

    public List<AnimeCard> getSaturday() {
        return saturday;
    }

    public List<AnimeCard> getSunday() {
        return sunday;
    }

    public List<AnimeCard> getOther() {
        return other;
    }

    public List<AnimeCard> getUnknown() {
        return unknown;
    }

}
