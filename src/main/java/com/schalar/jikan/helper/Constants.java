package com.schalar.jikan.helper;

import org.json.JSONObject;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;

@SuppressWarnings("unused")
public final class Constants {

    public static final String __DIR__ = new File("").getAbsolutePath();

    public static final String BASE_URL = "https://api.jikan.moe/v3";

    public static final String WINTER = "winter";
    public static final String SPRING = "spring";
    public static final String SUMMER = "summer";
    public static final String FALL = "fall";

    public static final String ANIME = "anime";
    public static final String MANGA = "manga";
    public static final String CHARACTER = "character";
    public static final String PERSON = "person";

    public static final String TOP_AIRING = "airing";
    public static final String TOP_UPCOMING = "upcoming";
    public static final String TOP_TV = "tv";
    public static final String TOP_MOVIE = "movie";
    public static final String TOP_OVA = "ova";
    public static final String TOP_SPECIAL = "special";

    public static final String TOP_MANGA = "manga";
    public static final String TOP_NOVEL = "novels";
    public static final String TOP_ONE_SHOT = "oneshots";
    public static final String TOP_DOUJINSHI = "doujin";
    public static final String TOP_MANHWA = "manhwa";
    public static final String TOP_MANHUA = "manhua";

    public static final String TOP_BY_POPULARITY = "bypopularity";
    public static final String TOP_BY_FAVORITES = "favorite";

    public static final String SEARCH_ANIME_TV = "tv";
    public static final String SEARCH_ANIME_OVA = "ova";
    public static final String SEARCH_ANIME_MOVIE = "movie";
    public static final String SEARCH_ANIME_SPECIAL = "special";
    public static final String SEARCH_ANIME_ONA = "ona";
    public static final String SEARCH_ANIME_MUSIC = "music";

    public static final String SEARCH_MANGA_MANGA = "manga";
    public static final String SEARCH_MANGA_NOVEL = "novel";
    public static final String SEARCH_MANGA_ONESHOT = "oneshot";
    public static final String SEARCH_MANGA_DOUJIN = "doujin";
    public static final String SEARCH_MANGA_MANHWA = "manhwa";
    public static final String SEARCH_MANGA_MANHUA = "manhua";

    public static final String SEARCH_ANIME_STATUS_AIRING = "airing";
    public static final String SEARCH_ANIME_STATUS_FINISHED_AIRING = "complete";
    public static final String SEARCH_ANIME_STATUS_COMPLETED = "completed";
    public static final String SEARCH_ANIME_STATUS_TO_BE_AIRED = "upcoming";
    public static final String SEARCH_ANIME_STATUS_TBA = SEARCH_ANIME_STATUS_TO_BE_AIRED;

    public static final String SEARCH_MANGA_STATUS_PUBLISHING = "publishing";
    public static final String SEARCH_MANGA_STATUS_FINISHED_PUBLISHING = "publishing";
    public static final String SEARCH_MANGA_STATUS_COMPLETED = "complete";
    public static final String SEARCH_MANGA_STATUS_TO_BE_PUBLISHED = "upcoming"; //TODO: Need to confirm value.
    public static final Integer SEARCH_MANGA_STATUS_TBP = 3; //TODO: Need to confirm value.

    public static final String SEARCH_ANIME_RATING_G = "g";
    public static final String SEARCH_ANIME_RATING_ALL = SEARCH_ANIME_RATING_G;
    public static final String SEARCH_ANIME_RATING_PG = "pg";
    public static final String SEARCH_ANIME_RATING_PG13 = "pg13";
    public static final String SEARCH_ANIME_RATING_R17 = "r17";
    public static final String SEARCH_ANIME_RATING_R = "r";
    public static final String SEARCH_ANIME_RATING_RX = "rx";
    public static final String SEARCH_ANIME_RATING_HENTAI = SEARCH_ANIME_RATING_RX;

    public static final Integer GENRE_ANIME_ACTION = 1;
    public static final Integer GENRE_ANIME_ADVENTURE = 2;
    public static final Integer GENRE_ANIME_CARS = 3;
    public static final Integer GENRE_ANIME_COMEDY = 4;
    public static final Integer GENRE_ANIME_DEMENTIA = 5;
    public static final Integer GENRE_ANIME_DEMONS = 6;
    public static final Integer GENRE_ANIME_MYSTERY = 7;
    public static final Integer GENRE_ANIME_DRAMA = 8;
    public static final Integer GENRE_ANIME_ECCHI = 9;
    public static final Integer GENRE_ANIME_FANTASY = 10;
    public static final Integer GENRE_ANIME_GAME = 11;
    public static final Integer GENRE_ANIME_HENTAI = 12;
    public static final Integer GENRE_ANIME_HISTORICAL = 13;
    public static final Integer GENRE_ANIME_HORROR = 14;
    public static final Integer GENRE_ANIME_KIDS = 15;
    public static final Integer GENRE_ANIME_MAGIC = 16;
    public static final Integer GENRE_ANIME_MARTIAL_ARTS = 17;
    public static final Integer GENRE_ANIME_MECHA = 18;
    public static final Integer GENRE_ANIME_MUSIC = 19;
    public static final Integer GENRE_ANIME_PARODY = 20;
    public static final Integer GENRE_ANIME_SAMURAI = 21;
    public static final Integer GENRE_ANIME_ROMANCE = 22;
    public static final Integer GENRE_ANIME_SCHOOL = 23;
    public static final Integer GENRE_ANIME_SCI_FI = 24;
    public static final Integer GENRE_ANIME_SHOUJO = 25;
    public static final Integer GENRE_ANIME_SHOUJO_AI = 26;
    public static final Integer GENRE_ANIME_SHOUNEN = 27;
    public static final Integer GENRE_ANIME_SHOUNEN_AI = 28;
    public static final Integer GENRE_ANIME_SPACE = 29;
    public static final Integer GENRE_ANIME_SPORTS = 30;
    public static final Integer GENRE_ANIME_SUPER_POWER = 31;
    public static final Integer GENRE_ANIME_VAMPIRE = 32;
    public static final Integer GENRE_ANIME_YAOI = 33;
    public static final Integer GENRE_ANIME_YURI = 34;
    public static final Integer GENRE_ANIME_HAREM = 35;
    public static final Integer GENRE_ANIME_SLICE_OF_LIFE = 36;
    public static final Integer GENRE_ANIME_SUPERNATURAL = 37;
    public static final Integer GENRE_ANIME_MILITARY = 38;
    public static final Integer GENRE_ANIME_POLICE = 39;
    public static final Integer GENRE_ANIME_PSYCHOLOGICAL = 40;
    public static final Integer GENRE_ANIME_THRILLER = 41;
    public static final Integer GENRE_ANIME_SEINEN = 42;
    public static final Integer GENRE_ANIME_JOSEI = 43;

    public static final Integer GENRE_MANGA_ACTION = 1;
    public static final Integer GENRE_MANGA_ADVENTURE = 2;
    public static final Integer GENRE_MANGA_CARS = 3;
    public static final Integer GENRE_MANGA_COMEDY = 4;
    public static final Integer GENRE_MANGA_DEMENTIA = 5;
    public static final Integer GENRE_MANGA_DEMONS = 6;
    public static final Integer GENRE_MANGA_MYSTERY = 7;
    public static final Integer GENRE_MANGA_DRAMA = 8;
    public static final Integer GENRE_MANGA_ECCHI = 9;
    public static final Integer GENRE_MANGA_FANTASY = 10;
    public static final Integer GENRE_MANGA_GAME = 11;
    public static final Integer GENRE_MANGA_HENTAI = 12;
    public static final Integer GENRE_MANGA_HISTORICAL = 13;
    public static final Integer GENRE_MANGA_HORROR = 14;
    public static final Integer GENRE_MANGA_KIDS = 15;
    public static final Integer GENRE_MANGA_MAGIC = 16;
    public static final Integer GENRE_MANGA_MARTIAL_ARTS = 17;
    public static final Integer GENRE_MANGA_MECHA = 18;
    public static final Integer GENRE_MANGA_MUSIC = 19;
    public static final Integer GENRE_MANGA_PARODY = 20;
    public static final Integer GENRE_MANGA_SAMURAI = 21;
    public static final Integer GENRE_MANGA_ROMANCE = 22;
    public static final Integer GENRE_MANGA_SCHOOL = 23;
    public static final Integer GENRE_MANGA_SCI_FI = 24;
    public static final Integer GENRE_MANGA_SHOUJO = 25;
    public static final Integer GENRE_MANGA_SHOUJO_AI = 26;
    public static final Integer GENRE_MANGA_SHOUNEN = 27;
    public static final Integer GENRE_MANGA_SHOUNEN_AI = 28;
    public static final Integer GENRE_MANGA_SPACE = 29;
    public static final Integer GENRE_MANGA_SPORTS = 30;
    public static final Integer GENRE_MANGA_SUPER_POWER = 31;
    public static final Integer GENRE_MANGA_VAMPIRE = 32;
    public static final Integer GENRE_MANGA_YAOI = 33;
    public static final Integer GENRE_MANGA_YURI = 34;
    public static final Integer GENRE_MANGA_HAREM = 35;
    public static final Integer GENRE_MANGA_SLICE_OF_LIFE = 36;
    public static final Integer GENRE_MANGA_SUPERNATURAL = 37;
    public static final Integer GENRE_MANGA_MILITARY = 38;
    public static final Integer GENRE_MANGA_POLICE = 39;
    public static final Integer GENRE_MANGA_PSYCHOLOGICAL = 40;
    public static final Integer GENRE_MANGA_THRILLER = 41;
    public static final Integer GENRE_MANGA_SEINEN = 42;
    public static final Integer GENRE_MANGA_JOSEI = 43;
    public static final Integer GENRE_MANGA_DOUJINSHI = 43;
    public static final Integer GENRE_MANGA_GENDER_BENDER = 44;

    public static final String USER_ANIME_LIST_ALL = "all";
    public static final String USER_ANIME_LIST_WATCHING = "watching";
    public static final String USER_ANIME_LIST_COMPLETED = "completed";
    public static final String USER_ANIME_LIST_ONHOLD = "onhold";
    public static final String USER_ANIME_LIST_DROPPED = "dropped";
    public static final String USER_ANIME_LIST_PTW = "plantowatch";
    public static final String USER_ANIME_LIST_PLAN_TO_WATCH = USER_ANIME_LIST_PTW;

    public static final String USER_MANGA_LIST_ALL = "all";
    public static final String USER_MANGA_LIST_READING = "reading";
    public static final String USER_MANGA_LIST_COMPLETED = "completed";
    public static final String USER_MANGA_LIST_ON_HOLD = "onhold";
    public static final String USER_MANGA_LIST_DROPPED = "dropped";
    public static final String USER_MANGA_LIST_PTR = "plantoread";
    public static final String USER_MANGA_LIST_PLAN_TO_READ = USER_MANGA_LIST_PTR;

    public static Integer getRandomInteger(String type, boolean nsfw) {
        try {
            URL u = new URL("https://raw.githubusercontent.com/seanbreckenridge/mal-id-cache/master/cache/" + type + "_cache.json");
            InputStream in = u.openStream();
            String s = new String(in.readAllBytes(), StandardCharsets.UTF_8);
            JSONObject object = new JSONObject(s);

            if (object.has("sfw")) {
                List<Object> list = object.getJSONArray("sfw").toList();

                if (nsfw)
                    list.addAll(object.getJSONArray("nsfw").toList());

                return (Integer) list.get(new Random().nextInt(list.size()) + 1);
            } else {
                List<Object> list = object.getJSONArray("ids").toList();
                return (Integer) list.get(new Random().nextInt(list.size()) + 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

}
