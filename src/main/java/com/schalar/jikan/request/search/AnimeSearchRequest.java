package com.schalar.jikan.request.search;

import com.schalar.jikan.request.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.schalar.jikan.helper.Client.http_build_query;

public class AnimeSearchRequest implements Request {

    private String query;

    private Integer page;

    private String charString;

    private String type = "0";

    private Float score = 0F;

    private Integer status = 0;

    private Integer producer = 0;

    private Integer rated = 0;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private final Set<Integer> genre = new HashSet<>();

    private Boolean genreExclude = false;

    public AnimeSearchRequest() {
        this(null);
    }

    public AnimeSearchRequest(String query) {
        this(query, 1);
    }

    public AnimeSearchRequest(String query, Integer page) {
        this.query = query;
        this.page = page;

        this.query = this.query != null ? query : "";
    }

    @Override
    public String getPath() {
        query = http_build_query(Map.of(
                "q", this.query,
                "page", this.page,
//                "letter", this.charString,
                "type", this.type,
                "score", this.score,
                "status", this.status,
//                "p", this.producer,
                "rated", this.rated,
//                "start_date", this.startDate != null ? this.startDate.format(DATE_ATOM) : null,
//                "end_date", this.endDate != null ? this.endDate.format(DATE_ATOM) : null,
                "genre_exclude", this.genreExclude
        ));

        if (!this.genre.isEmpty()) {
            this.genre.forEach(integer -> this.query += "&genre[]=" + integer);
        }

        return String.format("/search/anime?%s", this.query);
    }

    public AnimeSearchRequest setQuery(@Nullable String query) {
        this.query = query;
        this.query = this.query != null ? this.query : "";
        return this;
    }

    public AnimeSearchRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public AnimeSearchRequest setStartsWithChar(String charString) {
        this.charString = charString;
        return this;
    }

    public AnimeSearchRequest setType(String type) {
        this.type = type;
        return this;
    }

    public AnimeSearchRequest setScore(Float score) {
        this.score = score;
        return this;
    }

    public AnimeSearchRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public AnimeSearchRequest setProducer(Integer producer) {
        this.producer = producer;
        return this;
    }

    public AnimeSearchRequest setRated(Integer rated) {
        this.rated = rated;
        return this;
    }

    public AnimeSearchRequest setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public AnimeSearchRequest setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public AnimeSearchRequest setGenre(Integer @NotNull ... genre) {
        this.genre.addAll(Arrays.asList(genre));
        return this;
    }

    public AnimeSearchRequest setGenreExclude(Boolean genreExclude) {
        this.genreExclude = genreExclude;
        return this;
    }

}
