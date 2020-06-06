package com.schalar.jikan.request.search;

import com.schalar.jikan.request.Request;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.schalar.jikan.helper.Client.http_build_query;

public class MangaSearchRequest implements Request {

    private String query;

    private Integer page;

    private String charString;

    private String type = "0";

    private Float score = 0f;

    private Integer status = 0;

    private Integer magazine = 0;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private final Set<Integer> genre = new HashSet<>();

    private Boolean genreExclude = false;

    public MangaSearchRequest() {
        this(null);
    }

    public MangaSearchRequest(@Nullable String query) {
        this(query, 1);
    }

    public MangaSearchRequest(@Nullable String query, Integer page) {
        this.query = query;
        this.page = page;

        this.query = this.query != null ? this.query : "";
    }

    @Override
    public String getPath() {
        query = http_build_query(Map.of(
                "q", query,
                "page", page,
//                "letter", charString,
                "type", type,
                "score", score,
                "status", status,
//                "mid", magazine,
//                "rated", rated,
//                "start_date", startDate != null ? startDate.format(DATE_ATOM) : null,
//                "end_date", endDate != null ? endDate.format(DATE_ATOM) : null,
                "genre_exclude", genreExclude
        ));

        if (!this.genre.isEmpty()) {
            this.genre.forEach(integer -> this.query += "&genre[]=" + integer);
        }

        return String.format("/search/manga?%s", this.query);
    }

    public MangaSearchRequest setQuery(@Nullable String query) {
        this.query = query;
        this.query = this.query != null ? this.query : "";
        return this;
    }

    public MangaSearchRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public MangaSearchRequest setStartsWithChar(String charString) {
        this.charString = charString;
        return this;
    }

    public MangaSearchRequest setType(String type) {
        this.type = type;
        return this;
    }

    public MangaSearchRequest setScore(Float score) {
        this.score = score;
        return this;
    }

    public MangaSearchRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public MangaSearchRequest setMagazine(Integer magazine) {
        this.magazine = magazine;
        return this;
    }

    public MangaSearchRequest setStartDate(LocalDateTime date) {
        this.startDate = date;
        return this;
    }

    public MangaSearchRequest setEndDate(LocalDateTime date) {
        this.endDate = date;
        return this;
    }

    public MangaSearchRequest setGenre(Integer... genre) {
        this.genre.addAll(Arrays.asList(genre));
        return this;
    }

    public MangaSearchRequest setGenreExclude(Boolean genreExclude) {
        this.genreExclude = genreExclude;
        return this;
    }

}
