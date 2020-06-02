package com.schalar.jikan.request.seasonal;

import com.schalar.jikan.request.Request;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SeasonalRequest implements Request {

    private final Integer year;

    private final String season;

    private final Boolean later;

    public SeasonalRequest() {
        this(null, "");
    }

    public SeasonalRequest(@Nullable Integer year, @Nullable String season) {
        this(year, season, false);
    }

    public SeasonalRequest(@Nullable Integer year, @Nullable String season, @Nullable Boolean later) {
        if (!List.of("winter", "spring", "summer", "fail", "").contains(season)) {
            throw new IllegalArgumentException(String.format("Season %s is not valid.", season));
        }

        this.year = year;
        this.season = season;
        this.later = later;
    }

    @Override
    public String getPath() {
        if (this.later) {
            return "/season/later";
        }

        if (this.year == null || this.season.equals("")) {
            return "/season";
        }

        return String.format("/season/%s/%s", this.year, this.season);
    }

}
