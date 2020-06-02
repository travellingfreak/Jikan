package com.schalar.jikan;

import com.schalar.jikan.helper.Client;
import com.schalar.jikan.model.anime.*;
import com.schalar.jikan.model.character.Character;
import com.schalar.jikan.model.club.Club;
import com.schalar.jikan.model.club.UserProfile;
import com.schalar.jikan.model.common.Article;
import com.schalar.jikan.model.common.Picture;
import com.schalar.jikan.model.common.Recommendation;
import com.schalar.jikan.model.forum.ForumTopic;
import com.schalar.jikan.model.genre.AnimeGenre;
import com.schalar.jikan.model.genre.MangaGenre;
import com.schalar.jikan.model.magazine.Magazine;
import com.schalar.jikan.model.manga.CharacterListItem;
import com.schalar.jikan.model.manga.Manga;
import com.schalar.jikan.model.manga.MangaReview;
import com.schalar.jikan.model.manga.MangaStats;
import com.schalar.jikan.model.person.Person;
import com.schalar.jikan.model.producer.Producer;
import com.schalar.jikan.model.schedule.Schedule;
import com.schalar.jikan.model.search.AnimeSearch;
import com.schalar.jikan.model.search.CharacterSearch;
import com.schalar.jikan.model.search.MangaSearch;
import com.schalar.jikan.model.search.PersonSearch;
import com.schalar.jikan.model.seasonal.Seasonal;
import com.schalar.jikan.model.seasonlist.SeasonListItem;
import com.schalar.jikan.model.top.TopAnime;
import com.schalar.jikan.model.top.TopCharacter;
import com.schalar.jikan.model.top.TopManga;
import com.schalar.jikan.model.top.TopPerson;
import com.schalar.jikan.model.user.*;
import com.schalar.jikan.request.anime.*;
import com.schalar.jikan.request.character.CharacterPicturesRequest;
import com.schalar.jikan.request.character.CharacterRequest;
import com.schalar.jikan.request.club.ClubRequest;
import com.schalar.jikan.request.club.UserListRequest;
import com.schalar.jikan.request.genre.AnimeGenreRequest;
import com.schalar.jikan.request.genre.MangaGenreRequest;
import com.schalar.jikan.request.magazine.MagazineRequest;
import com.schalar.jikan.request.manga.*;
import com.schalar.jikan.request.person.PersonPicturesRequest;
import com.schalar.jikan.request.person.PersonRequest;
import com.schalar.jikan.request.producer.ProducerRequest;
import com.schalar.jikan.request.schedule.ScheduleRequest;
import com.schalar.jikan.request.search.AnimeSearchRequest;
import com.schalar.jikan.request.search.CharacterSearchRequest;
import com.schalar.jikan.request.search.MangaSearchRequest;
import com.schalar.jikan.request.search.PersonSearchRequest;
import com.schalar.jikan.request.seasonal.SeasonalRequest;
import com.schalar.jikan.request.seasonlist.SeasonListRequest;
import com.schalar.jikan.request.top.TopAnimeRequest;
import com.schalar.jikan.request.top.TopCharactersRequest;
import com.schalar.jikan.request.top.TopMangaRequest;
import com.schalar.jikan.request.top.TopPeopleRequest;
import com.schalar.jikan.request.user.*;
import com.schalar.jikan.serializer.Serializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.http.HttpClient;
import java.util.List;
import java.util.Objects;

@SuppressWarnings({"rawtypes", "unchecked"})
public class JikanClient {

    private final Client http;

    private final Serializer serializer;

    public JikanClient() {
        this(null);
    }

    public JikanClient(@Nullable HttpClient httpClient) {
        this.http = new Client(httpClient);
        this.serializer = new Serializer();
    }

    public Anime getAnime(@NotNull AnimeRequest request) {
        var response = this.http.get(request.getPath());
        return (Anime) this.serializer.deserialize(Objects.requireNonNull(response), Anime.class);
    }

    public Episodes getAnimeEpisodes(@NotNull AnimeEpisodesRequest request) {
        var response = this.http.get(request.getPath());
        return (Episodes) this.serializer.deserialize(Objects.requireNonNull(response), Episodes.class);
    }

    public AnimeVideos getAnimeVideos(@NotNull AnimeVideosRequest request) {
        var response = this.http.get(request.getPath());
        return (AnimeVideos) this.serializer.deserialize(Objects.requireNonNull(response), AnimeVideos.class);
    }

    public Manga getManga(@NotNull MangaRequest request) {
        var response = this.http.get(request.getPath());
        return (Manga) this.serializer.deserialize(Objects.requireNonNull(response), Manga.class);
    }

    public Character getCharacter(@NotNull CharacterRequest request) {
        var response = this.http.get(request.getPath());
        return (Character) this.serializer.deserialize(Objects.requireNonNull(response), Character.class);
    }

    public Person getPerson(@NotNull PersonRequest request) {
        var response = this.http.get(request.getPath());
        return (Person) this.serializer.deserialize(Objects.requireNonNull(response), Person.class);
    }

    public Profile getUserProfile(@NotNull UserProfileRequest request) {
        var response = this.http.get(request.getPath());
        return (Profile) this.serializer.deserialize(Objects.requireNonNull(response), Profile.class);
    }

    public List<Friend> getUserFriends(@NotNull UserFriendsRequest request) {
        var response = this.http.get(request.getPath());
        var friends = json_decode(Objects.requireNonNull(response));
        return (List<Friend>) this.serializer.deserialize(json_encode(friends.getJSONArray("friends")), String.format("List<%s>", Friend.class));
    }

    public Seasonal getSeasonal(@NotNull SeasonalRequest request) {
        var response = this.http.get(request.getPath());
        return (Seasonal) this.serializer.deserialize(Objects.requireNonNull(response), Seasonal.class);
    }

    public Producer getProducer(@NotNull ProducerRequest request) {
        var response = this.http.get(request.getPath());
        return (Producer) this.serializer.deserialize(Objects.requireNonNull(response), Producer.class);
    }

    public Magazine getMagazine(@NotNull MagazineRequest request) {
        var response = this.http.get(request.getPath());
        return (Magazine) this.serializer.deserialize(Objects.requireNonNull(response), Magazine.class);
    }

    public AnimeGenre getAnimeGenre(@NotNull AnimeGenreRequest request) {
        var response = this.http.get(request.getPath());
        return (AnimeGenre) this.serializer.deserialize(Objects.requireNonNull(response), AnimeGenre.class);
    }

    public MangaGenre getMangaGenre(@NotNull MangaGenreRequest request) {
        var response = this.http.get(request.getPath());
        return (MangaGenre) this.serializer.deserialize(Objects.requireNonNull(response), MangaGenre.class);
    }

    public Schedule getSchedule(@NotNull ScheduleRequest request) {
        var response = this.http.get(request.getPath());
        return (Schedule) this.serializer.deserialize(Objects.requireNonNull(response), Schedule.class);
    }

    public AnimeCharactersAndStaff getAnimeCharactersAndStaff(@NotNull AnimeCharactersAndStaffRequest request) {
        var response = this.http.get(request.getPath());
        return (AnimeCharactersAndStaff) this.serializer.deserialize(Objects.requireNonNull(response), AnimeCharactersAndStaff.class);
    }

    public List<Picture> getAnimePictures(@NotNull AnimePicturesRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<Picture>) this.serializer.deserialize(json_encode(data.getJSONArray("pictures")), String.format("List<%s>", Picture.class));
    }

    public List<Picture> getMangaPictures(@NotNull MangaPicturesRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<Picture>) this.serializer.deserialize(json_encode(data.getJSONArray("pictures")), String.format("List<%s>", Picture.class));
    }

    public List<Picture> getCharacterPictures(@NotNull CharacterPicturesRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<Picture>) this.serializer.deserialize(json_encode(data.getJSONArray("pictures")), String.format("List<%s>", Picture.class));
    }

    public List<Picture> getPersonPictures(@NotNull PersonPicturesRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<Picture>) this.serializer.deserialize(json_encode(data.getJSONArray("pictures")), String.format("List<%s>", Picture.class));
    }

    public AnimeSearch getAnimeSearch(@NotNull AnimeSearchRequest request) {
        var response = this.http.get(request.getPath());
        return (AnimeSearch) this.serializer.deserialize(Objects.requireNonNull(response), AnimeSearch.class);
    }

    public MangaSearch getMangaSearch(@NotNull MangaSearchRequest request) {
        var response = this.http.get(request.getPath());
        return (MangaSearch) this.serializer.deserialize(Objects.requireNonNull(response), MangaSearch.class);
    }

    public CharacterSearch getCharacterSearch(@NotNull CharacterSearchRequest request) {
        var response = this.http.get(request.getPath());
        return (CharacterSearch) this.serializer.deserialize(Objects.requireNonNull(response), CharacterSearch.class);
    }

    public PersonSearch getPersonSearch(@NotNull PersonSearchRequest request) {
        var response = this.http.get(request.getPath());
        return (PersonSearch) this.serializer.deserialize(Objects.requireNonNull(response), PersonSearch.class);
    }

    public List<CharacterListItem> getMangaCharacters(@NotNull MangaCharactersRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<CharacterListItem>) this.serializer.deserialize(json_encode(data.getJSONArray("characters")), String.format("List<%s>", CharacterListItem.class));
    }

    public List<TopAnime> getTopAnime(@NotNull TopAnimeRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<TopAnime>) this.serializer.deserialize(json_encode(data.getJSONArray("top")), String.format("List<%s>", TopAnime.class));
    }

    public List<TopManga> getTopManga(@NotNull TopMangaRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<TopManga>) this.serializer.deserialize(json_encode(data.getJSONArray("top")), String.format("List<%s>", TopManga.class));
    }

    public List<TopCharacter> getTopCharacters(@NotNull TopCharactersRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<TopCharacter>) this.serializer.deserialize(json_encode(data.getJSONArray("top")), String.format("List<%s>", TopCharacter.class));
    }

    public List<TopPerson> getTopPeople(@NotNull TopPeopleRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<TopPerson>) this.serializer.deserialize(json_encode(data.getJSONArray("top")), String.format("List<%s>", TopPerson.class));
    }

    public AnimeStats getAnimeStats(@NotNull AnimeStatsRequest request) {
        var response = this.http.get(request.getPath());
        return (AnimeStats) this.serializer.deserialize(Objects.requireNonNull(response), AnimeStats.class);
    }

    public MangaStats getMangaStats(@NotNull MangaStatsRequest request) {
        var response = this.http.get(request.getPath());
        return (MangaStats) this.serializer.deserialize(Objects.requireNonNull(response), MangaStats.class);
    }

    public List<ForumTopic> getAnimeForum(@NotNull AnimeForumRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<ForumTopic>) this.serializer.deserialize(json_encode(data.getJSONArray("topics")), String.format("List<%s>", ForumTopic.class));
    }

    public List<ForumTopic> getMangaForum(@NotNull MangaForumRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<ForumTopic>) this.serializer.deserialize(json_encode(data.getJSONArray("topics")), String.format("List<%s>", ForumTopic.class));
    }

    @Nullable
    public String getAnimeMoreInfo(@NotNull AnimeMoreInfoRequest request) {
        var response = this.http.get(request.getPath());
        return json_decode(Objects.requireNonNull(response)).has("moreinfo") ? json_decode(Objects.requireNonNull(response)).getString("moreinfo") : null;
    }

    @Nullable
    public String getMangaMoreInfo(@NotNull MangaMoreInfoRequest request) {
        var response = this.http.get(request.getPath());
        return json_decode(Objects.requireNonNull(response)).has("moreinfo") ? json_decode(Objects.requireNonNull(response)).getString("moreinfo") : null;
    }

    public List<SeasonListItem> getSeasonList(@NotNull SeasonListRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<SeasonListItem>) this.serializer.deserialize(json_encode(data.getJSONArray("archive")), String.format("List<%s>", SeasonListItem.class));
    }

    public List<History> getUserHistory(@NotNull UserHistoryRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<History>) this.serializer.deserialize(json_encode(data.getJSONArray("history")), String.format("List<%s>", History.class));
    }

    public List<AnimeListItem> getUserAnimeList(@NotNull UserAnimeListRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<AnimeListItem>) this.serializer.deserialize(json_encode(data.getJSONArray("anime")), String.format("List<%s>", AnimeListItem.class));
    }

    public List<MangaListItem> getUserMangaList(@NotNull UserMangaListRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<MangaListItem>) this.serializer.deserialize(json_encode(data.getJSONArray("manga")), String.format("List<%s>", MangaListItem.class));
    }

    public List<AnimeListItem> getAnimeRecentlyUpdatedByUsers(@NotNull AnimeRecentlyUpdatedByUsersRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<AnimeListItem>) this.serializer.deserialize(json_encode(data.getJSONArray("users")), String.format("List<%s>", AnimeListItem.class));
    }

    public List<MangaListItem> getMangaRecentlyUpdatedByUsers(@NotNull MangaRecentlyUpdatedByUsersRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<MangaListItem>) this.serializer.deserialize(json_encode(data.getJSONArray("users")), String.format("List<%s>", MangaListItem.class));
    }

    public List<Recommendation> getAnimeRecommendations(@NotNull AnimeRecommendationsRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<Recommendation>) this.serializer.deserialize(json_encode(data.getJSONArray("recommendations")), String.format("List<%s>", Recommendation.class));
    }

    public List<Recommendation> getMangaRecommendations(@NotNull MangaRecommendationsRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<Recommendation>) this.serializer.deserialize(json_encode(data.getJSONArray("recommendations")), String.format("List<%s>", Recommendation.class));
    }

    public List<UserProfile> getClubUsers(@NotNull UserListRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<UserProfile>) this.serializer.deserialize(json_encode(data.getJSONArray("members")), String.format("List<%s>", UserProfile.class));
    }

    public List<AnimeReview> getAnimeReviews(@NotNull AnimeReviewsRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<AnimeReview>) this.serializer.deserialize(json_encode(data.getJSONArray("reviews")), String.format("List<%s>", AnimeReview.class));
    }

    public List<MangaReview> getMangaReviews(@NotNull MangaReviewsRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<MangaReview>) this.serializer.deserialize(json_encode(data.getJSONArray("reviews")), String.format("List<%s>", MangaReview.class));
    }

    public Club getClub(@NotNull ClubRequest request) {
        var response = this.http.get(request.getPath());
        return (Club) this.serializer.deserialize(Objects.requireNonNull(response), Club.class);
    }

    public List<Article> getAnimeNews(@NotNull AnimeNewsRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<Article>) this.serializer.deserialize(json_encode(data.getJSONArray("articles")), String.format("List<%s>", Article.class));
    }

    public List<Article> getMangaNews(@NotNull MangaNewsRequest request) {
        var response = this.http.get(request.getPath());
        var data = json_decode(Objects.requireNonNull(response));
        return (List<Article>) this.serializer.deserialize(json_encode(data.getJSONArray("articles")), String.format("List<%s>", Article.class));
    }

    private String json_encode(@NotNull JSONArray friends) {
        return friends.toString();
    }

    private JSONObject json_decode(@NotNull String body) {
        return new JSONObject(body);
    }

}