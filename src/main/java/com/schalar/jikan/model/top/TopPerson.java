package com.schalar.jikan.model.top;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;

@Generated(list = true)
public class TopPerson extends Model {

    public TopPerson() {
        addCustomFunctionForField("birthday", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
    }

    private Integer malId;

    private Integer rank;

    private String title;

    private String url;

    @Nullable
    private String nameKanji;

    private Integer favorites;

    private String imageUrl;

    @Nullable
    private LocalDateTime birthday;

    @Override
    public String toString() {
        return this.getTitle();
    }

    public Integer getRank() {
        return this.rank;
    }

    public Integer getMalId() {
        return this.malId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    @Nullable
    public String getNameKanji() {
        return this.nameKanji;
    }

    public Integer getFavorites() {
        return this.favorites;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public LocalDateTime getBirthday() {
        return this.birthday;
    }
    
}
