package com.twitter.h.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long likeId;

    @ManyToOne
    private User likingUser;

    @ManyToOne
    private Tweet likedTweet;
}
