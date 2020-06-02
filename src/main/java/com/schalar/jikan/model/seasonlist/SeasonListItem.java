package com.schalar.jikan.model.seasonlist;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;

import java.util.List;

@Generated(list = true)
public class SeasonListItem extends Model {

    public SeasonListItem() {
        addCustomFunctionForField("seasons", o -> buildStringList().apply(o));
    }

    public Integer year;

    public List<String> seasons;

    public Integer getYear() {
        return year;
    }

    public List<String> getSeasons() {
        return seasons;
    }

}
