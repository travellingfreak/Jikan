package com.schalar.jikan.model.club;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MalUrl;

import java.time.LocalDateTime;
import java.util.List;

@Generated
public class Club extends Model {

    public Club() {
        addCustomFunctionForField("created", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("staff", o -> buildUrlList().apply(o));
        addCustomFunctionForField("animeRelations", o -> buildUrlList().apply(o));
        addCustomFunctionForField("mangaRelations", o -> buildUrlList().apply(o));
        addCustomFunctionForField("characterRelations", o -> buildUrlList().apply(o));
    }

    private Integer malId;

    private String url;

    private String imageUrl;

    private String title;

    private Integer membersCount;

    private Integer picturesCount;

    private String category;

    private LocalDateTime created;

    private String type;

    private List<MalUrl> staff;

    private List<MalUrl> animeRelations;

    private List<MalUrl> mangaRelations;

    private List<MalUrl> characterRelations;

    public Integer getMalId() {
        return malId;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public Integer getPicturesCount() {
        return picturesCount;
    }

    public String getCategory() {
        return category;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public String getType() {
        return type;
    }

    public List<MalUrl> getStaff() {
        return staff;
    }

    public List<MalUrl> getAnimeRelations() {
        return animeRelations;
    }

    public List<MalUrl> getMangaRelations() {
        return mangaRelations;
    }

    public List<MalUrl> getCharacterRelations() {
        return characterRelations;
    }

}
