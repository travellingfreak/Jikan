package com.schalar.jikan.test;

import com.schalar.jikan.JikanClient;
import com.schalar.jikan.helper.Constants;
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
import com.schalar.jikan.model.seasonal.SeasonalAnime;
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
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class JikanTest extends Assertions {

    private static JikanClient jikan;

    public static void assertContains(String expected, @Nullable String actual) {
        assertNotNull(actual);
        assertTrue(actual.contains(expected));
    }

    @BeforeAll
    public static void setUp() {
        jikan = new JikanClient();
    }

    @BeforeEach
    public void handle() {
        try {
            TimeUnit.SECONDS.sleep(2); // This allows all tests to run without RateLimiting.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void it_gets_anime() {
        var request = new AnimeRequest(1);
        var response = jikan.getAnime(request);
        assertEquals(Anime.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_episodes() {
        var request = new AnimeEpisodesRequest(1);
        var response = jikan.getAnimeEpisodes(request);
        assertNotEquals(0, response.getEpisodes().size());
        assertEquals(EpisodeListItem.class, response.getEpisodes().get(response.getEpisodes().size() - 1).getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_videos() {
        var request = new AnimeVideosRequest(1);
        var response =  jikan.getAnimeVideos(request);
        assertNotEquals(0, response.getPromos().size());
        assertEquals(PromoListItem.class, response.getPromos().get(response.getPromos().size() - 1).getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_manga() {
        var request = new MangaRequest(1);
        var response =  jikan.getManga(request);
        assertEquals(Manga.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_characters() {
        var request = new CharacterRequest(1);
        var response =  jikan.getCharacter(request);
        assertEquals(Character.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_persons() {
        var request = new PersonRequest(1);
        var response =  jikan.getPerson(request);
        assertEquals(Person.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_user_profile() {
        var request = new UserProfileRequest("sandshark");
        var response =  jikan.getUserProfile(request);
        assertEquals(Profile.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_user_friends() {
        var request = new UserFriendsRequest("sandshark");
        var response =  jikan.getUserFriends(request);
        assertNotEquals(0, response.size());
        assertEquals(Friend.class, response.get(0).getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_seasonal() {
        var request = new SeasonalRequest(2018, "winter");
        var response =  jikan.getSeasonal(request);
        assertEquals(Seasonal.class, response.getClass());
        assertNotEquals(0, response.getAnime().size());
        assertEquals(SeasonalAnime.class, response.getAnime().get(0).getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_producers() {
        var request = new ProducerRequest(1);
        var response =  jikan.getProducer(request);
        assertEquals(Producer.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_magazines() {
        var request = new MagazineRequest(1);
        var response =  jikan.getMagazine(request);
        assertEquals(Magazine.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_genres() {
        var request = new AnimeGenreRequest(1);
        var response =  jikan.getAnimeGenre(request);
        assertEquals(AnimeGenre.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_manga_genres() {
        var request = new MangaGenreRequest(1);
        var response =  jikan.getMangaGenre(request);
        assertEquals(MangaGenre.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_schedule() {
        var request = new ScheduleRequest();
        var response =  jikan.getSchedule(request);
        assertEquals(Schedule.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_characters_and_staff() {
        var request = new AnimeCharactersAndStaffRequest(1);
        var response =  jikan.getAnimeCharactersAndStaff(request);
        assertEquals(AnimeCharactersAndStaff.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_pictures() {
        var request = new AnimePicturesRequest(1);
        var response =  jikan.getAnimePictures(request);
        assertNotEquals(0, response.size());
        assertEquals(Picture.class, response.get(0).getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_manga_pictures() {
        var request = new MangaPicturesRequest(1);
        var response =  jikan.getMangaPictures(request);
        assertNotEquals(0, response.size());
        assertEquals(Picture.class, response.get(0).getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_character_pictures() {
        var request = new CharacterPicturesRequest(1);
        var response =  jikan.getCharacterPictures(request);
        assertNotEquals(0, response.size());
        assertEquals(Picture.class, response.get(0).getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_person_pictures() {
        var request = new PersonPicturesRequest(1);
        var response =  jikan.getPersonPictures(request);
        assertNotEquals(0, response.size());
        assertEquals(Picture.class, response.get(0).getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_search() {
        var request = new AnimeSearchRequest("Ghost In The Shell");
        var response =  jikan.getAnimeSearch(request);
        assertEquals(AnimeSearch.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_manga_search() {
        var request = new MangaSearchRequest("One Piece");
        var response =  jikan.getMangaSearch(request);
        assertEquals(MangaSearch.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_character_search() {
        var request = new CharacterSearchRequest("Revy");
        var response =  jikan.getCharacterSearch(request);
        assertEquals(CharacterSearch.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_person_search() {
        var request = new PersonSearchRequest("shinkai");
        var response =  jikan.getPersonSearch(request);
        assertEquals(PersonSearch.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_manga_characters() {
        var request = new MangaCharactersRequest(1);
        var response =  jikan.getMangaCharacters(request);
        assertEquals(CharacterListItem.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_top_anime() {
        var request = new TopAnimeRequest(1, Constants.TOP_UPCOMING);
        var response =  jikan.getTopAnime(request);
        assertEquals(TopAnime.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_top_manga() {
        var request = new TopMangaRequest(1, Constants.TOP_MANGA);
        var response =  jikan.getTopManga(request);
        assertEquals(TopManga.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_top_characters() {
        var request = new TopCharactersRequest(1);
        var response =  jikan.getTopCharacters(request);
        assertEquals(TopCharacter.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_top_people() {
        var request = new TopPeopleRequest(1);
        var response =  jikan.getTopPeople(request);
        assertEquals(TopPerson.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_stats() {
        var request = new AnimeStatsRequest(1);
        var response =  jikan.getAnimeStats(request);
        assertEquals(AnimeStats.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_manga_stats() {
        var request = new MangaStatsRequest(1);
        var response =  jikan.getMangaStats(request);
        assertEquals(MangaStats.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_forum() {
        var request = new AnimeForumRequest(1);
        var response =  jikan.getAnimeForum(request);
        assertEquals(ForumTopic.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_manga_forum() {
        var request = new MangaForumRequest(1);
        var response =  jikan.getMangaForum(request);
        assertEquals(ForumTopic.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_more_anime_info() {
        var request = new AnimeMoreInfoRequest(1);
        var response =  jikan.getAnimeMoreInfo(request);
        assertContains("Suggested Order", response);
        assertContains("(takes place between episodes 22 and 23)", response);

        System.out.println(response);
    }

    @Test
    public void it_gets_more_manga_info() {
        var request = new MangaMoreInfoRequest(2);
        var response =  jikan.getMangaMoreInfo(request);
        assertContains("Berserk: The Prototype", response);
        assertContains("on which the Berserk manga is based.", response);

        System.out.println(response);
    }

    @Test
    public void it_gets_season_list() {
        var request = new SeasonListRequest();
        var response =  jikan.getSeasonList(request);
        assertEquals(SeasonListItem.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_user_history() {
        var request = new UserHistoryRequest("sandshark", "anime");
        var response =  jikan.getUserHistory(request);
        assertEquals(History.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_user_anime_list() {
        var request = new UserAnimeListRequest("sandshark", 1);
        var response =  jikan.getUserAnimeList(request);
        assertEquals(AnimeListItem.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_user_manga_list() {
        var request = new UserMangaListRequest("sandshark", 1);
        var response =  jikan.getUserMangaList(request);
        assertEquals(MangaListItem.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_recently_updated_by_users() {
        var request = new AnimeRecentlyUpdatedByUsersRequest(1);
        var response =  jikan.getAnimeRecentlyUpdatedByUsers(request);
        assertEquals(AnimeListItem.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_manga_recently_updated_by_users() {
        var request = new MangaRecentlyUpdatedByUsersRequest(1);
        var response =  jikan.getMangaRecentlyUpdatedByUsers(request);
        assertEquals(MangaListItem.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_recommendations() {
        var request = new AnimeRecommendationsRequest(1);
        var response =  jikan.getAnimeRecommendations(request);
        assertEquals(Recommendation.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_manga_recommendations() {
        var request = new MangaRecommendationsRequest(1);
        var response =  jikan.getMangaRecommendations(request);
        assertEquals(Recommendation.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_club_users() {
        var request = new UserListRequest(21349);
        var response =  jikan.getClubUsers(request);
        assertEquals(UserProfile.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_reviews() {
        var request = new AnimeReviewsRequest(1);
        var response =  jikan.getAnimeReviews(request);
        assertEquals(AnimeReview.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_manga_reviews() {
        var request = new MangaReviewsRequest(1);
        var response =  jikan.getMangaReviews(request);
        assertEquals(MangaReview.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_clubs() {
        var request = new ClubRequest(21349);
        var response =  jikan.getClub(request);
        assertEquals(Club.class, response.getClass());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_anime_news() {
        var request = new AnimeNewsRequest(1);
        var response =  jikan.getAnimeNews(request);
        assertEquals(Article.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

    @Test
    public void it_gets_manga_news() {
        var request = new MangaNewsRequest(1);
        var response =  jikan.getMangaNews(request);
        assertEquals(Article.class, response.get(0).getClass());
        assertNotEquals(0, response.size());

        System.out.println(response.toString());
    }

}
