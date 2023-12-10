package com.twitter.h.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tweetId;
    private String tweetImage;
    private String tweetVideo;

    @ManyToOne
    private User tweetUser;

    private String tweetContent;

    @OneToMany(mappedBy = "likedTweet", cascade = CascadeType.ALL)
    private List<Like> tweetLikes = new ArrayList<>();

    @OneToMany
    private List<Tweet> replyTweets = new ArrayList<>();

    @ManyToMany
    private List<User> reTweetingUsers = new ArrayList<>();

    @ManyToOne
    private Tweet repliedToTweet;

    private boolean isReplyTweet;
    private boolean isOriginalTweet;
}
