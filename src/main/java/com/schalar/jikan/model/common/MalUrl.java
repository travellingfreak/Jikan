package com.schalar.jikan.model.common;

import com.schalar.jikan.model.Model;

public class MalUrl extends Model {

    private final String name;

    private final String url;

    public MalUrl(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public Integer getMalId() {
        return Integer.valueOf(this.url.replace("https://myanimelist.net/" + getType() + "/", "").split("/")[0]);
    }

    public String getType() {
        return this.url.replace("https://myanimelist.net/", "").split("/")[0];
    }

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

}
