package com.schalar.jikan.model.manga;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;

@Generated(list = true)
public class CharacterListItem extends Model {

    private Integer malId;

    private String url;

    private String imageUrl;

    private String name;

    private String role;

    @Override
    public String toString() {
        return this.name;
    }

    public Integer getMalId() {
        return malId;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getRole() {
        return role;
    }

}
