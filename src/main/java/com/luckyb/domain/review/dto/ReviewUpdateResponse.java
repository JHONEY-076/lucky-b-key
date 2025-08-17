package com.luckyb.domain.review.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor

public class ReviewUpdateResponse {
    private boolean success;
    private ReviewData data;

    @Getter
    @Builder
    @AllArgsConstructor
    public static class ReviewData {
        private String id;
        private String text;
        private int rating;
    }


}
