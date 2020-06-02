package com.schalar.jikan.model.club;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;

@Generated(list = true)
public class UserProfile extends Model {

    private String username;

    private String url;

    private String imageUrl;

    public String getUsername() {
        return username;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
