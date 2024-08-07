package com.example.we_save.domain.post.controller.response;

import com.example.we_save.domain.comment.controller.response.CommentDto;
import com.example.we_save.domain.post.entity.Category;
import com.example.we_save.domain.user.entity.User;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostResponseDtoWithComments {
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private Category category;
    private String title;
    private String content;
    private String status;
    private double longitude;
    private double latitude;
    private String postRegionName;
    private int hearts;
    private int dislikes;
    private int comments;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<String> images;
    private List<CommentDto> commentsList;
}
