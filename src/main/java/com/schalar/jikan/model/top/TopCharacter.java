package com.schalar.jikan.model.top;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MalUrl;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@Generated(list = true)
public class TopCharacter extends Model {

    public TopCharacter() {
        addCustomFunctionForField("animeography", o -> buildUrlList().apply(o));
        addCustomFunctionForField("mangaography", o -> buildUrlList().apply(o));
    }

    private Integer malId;

    private Integer rank;

    private String title;

    private String url;

    @Nullable
    private String nameKanji;

    private List<MalUrl> animeography;

    private List<MalUrl> mangaography;

    private Integer favorites;

    private String imageUrl;

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

    public List<MalUrl> getAnimeography() {
        return this.animeography;
    }

    public List<MalUrl> getMangaography() {
        return this.mangaography;
    }

    public Integer getFavorites() {
        return this.favorites;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
    
}
