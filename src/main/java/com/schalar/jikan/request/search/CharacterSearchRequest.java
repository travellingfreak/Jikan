package com.schalar.jikan.request.search;

import com.schalar.jikan.request.Request;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

import static com.schalar.jikan.helper.Client.http_build_query;

public class CharacterSearchRequest implements Request {

    private String query;

    private Integer page;

    private String charString;

    public CharacterSearchRequest() {
        this(null);
    }
    
    public CharacterSearchRequest(@Nullable String query) {
        this(query, 1);
    }
    
    public CharacterSearchRequest(@Nullable String query, Integer page) {
        this.query = query;
        this.page = page;

        this.query = this.query != null ? this.query : "";
    }

    @Override
    public String getPath() {
        this.query = http_build_query(Map.of(
                "q", this.query,
                "show", this.page
//                'letter', this.char,
        ));

        return String.format("/search/character?%s", this.query);
    }

    public CharacterSearchRequest setQuery(@Nullable String query) {
        this.query = query;
        this.query = this.query != null ? this.query : "";
        return this;
    }

    public CharacterSearchRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public CharacterSearchRequest setStartsWithChar(String charString) {
        this.charString = charString;
        return this;
    }

}
