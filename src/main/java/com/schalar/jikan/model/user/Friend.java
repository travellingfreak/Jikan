package com.schalar.jikan.model.user;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;

import java.time.LocalDateTime;

@Generated(list = true)
public class Friend extends Model {

    public Friend() {
        addCustomFunctionForField("lastOnline", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("friendsSince", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
    }

    private String url;

    private String username;

    private String imageUrl;
    
    private LocalDateTime lastOnline;

    private LocalDateTime friendsSince;

    @Override
    public String toString() {
        return this.username;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public LocalDateTime getLastOnline() {
        return lastOnline;
    }

    public LocalDateTime getFriendsSince() {
        return friendsSince;
    }

}
