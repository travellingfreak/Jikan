package com.schalar.jikan.model.common;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;

import java.time.LocalDateTime;

@Generated(list = true)
public class Article extends Model {

    public Article() {
        addCustomFunctionForField("date", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
    }

    private String url;

    private String title;

    private LocalDateTime date;

    private String authorName;

    private String authorUrl;

    private String forumUrl;

    private String imageUrl;

    private Integer comments;

    private String intro;

}
