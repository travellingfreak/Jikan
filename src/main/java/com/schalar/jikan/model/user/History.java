package com.schalar.jikan.model.user;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MalUrl;

import java.time.LocalDateTime;

@Generated(list = true)
public class History extends Model {

    public History() {
        addCustomFunctionForField("date", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
    }

    public MalUrl malUrl;

    private Integer increment;

    private LocalDateTime date;

    public MalUrl getMalUrl() {
        return malUrl;
    }

    public Integer getIncrement() {
        return increment;
    }

    public LocalDateTime getDate() {
        return date;
    }

}
