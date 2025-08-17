package com.luckyb.domain.review.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "reviews")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String shelterId;
    private String userId;
    private String userNickname;

    @Column(columnDefinition = "TEXT")
    private String text;

    private int rating;

    @ElementCollection
    private List<String> photoUrls;

    private LocalDateTime createdAt;
}
