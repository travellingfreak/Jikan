package com.schalar.jikan.request.search;

import com.schalar.jikan.request.Request;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

import static com.schalar.jikan.helper.Client.http_build_query;

public class PersonSearchRequest implements Request {

    private String query;

    private Integer page;

    private String charString;

    public PersonSearchRequest() {
        this(null);
    }
    
    public PersonSearchRequest(@Nullable String query) {
        this(query, 1);
    }
    
    public PersonSearchRequest(@Nullable String query, Integer page) {
        this.query = query;
        this.page = page;

        this.query = this.query != null ? this.query : "";
    }

    @Override
    public String getPath() {

        query = http_build_query(Map.of(
                "q", this.query,
                "show", this.page
//                "letter", this.charString
        ));

        return String.format("/search/people?%s", this.query);
    }

    public PersonSearchRequest setQuery(@Nullable String query) {
        this.query = query;
        this.query = this.query != null ? this.query : "";
        return this;
    }

    public PersonSearchRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public PersonSearchRequest setStartsWithChar(String charString) {
        this.charString = charString;
        return this;
    }
    
}
