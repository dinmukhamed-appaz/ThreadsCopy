package com.thread.threads.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id
    private int postId;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "likes", nullable = false)
    private int likes;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity userEntity;

}
