package com.schalar.jikan.request.user;

import com.schalar.jikan.request.Request;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UserHistoryRequest implements Request {

    private final String username;

    @Nullable
    private String type;

    public UserHistoryRequest(String username) {
        this(username, "");
    }

    public UserHistoryRequest(String username, @Nullable String type) {
        this.username = username;

        if (type != null) {
            if (!List.of("anime", "manga").contains(type)) {
                throw new IllegalArgumentException(String.format("Type %s is not valid.", type));
            }

            this.type = type;
        }
    }

    @Override
    public String getPath() {
        return String.format("/user/%s/history/%s", this.username, this.type);
    }

}
