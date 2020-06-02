package com.schalar.jikan.model.forum;

import com.schalar.jikan.helper.Generated;
import com.schalar.jikan.model.Model;
import org.json.JSONObject;

import java.time.LocalDateTime;

@Generated(list = true)
public class ForumTopic extends Model {

    public ForumTopic() {
        addCustomFunctionForField("datePosted", o -> LocalDateTime.parse(((String) o).replace("+00:00", "")));
        addCustomFunctionForField("lastPost", o -> {
            JSONObject jsonObject = (JSONObject) o;
            return new ForumPost(
                    jsonObject.getString("url"),
                    jsonObject.getString("author_name"),
                    jsonObject.getString("author_url"),
                    LocalDateTime.parse(jsonObject.getString("date_posted").replace("+00:00", ""))
            );
        });
    }

    private Integer topicId;

    private String url;

    private String title;

    private LocalDateTime datePosted;

    private String authorName;

    private String authorUrl;

    private Integer replies = 0;

    private ForumPost lastPost;

    @Override
    public String toString() {
        return this.title;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public Integer getReplies() {
        return replies;
    }

    public ForumPost getLastPost() {
        return lastPost;
    }

}
