package com.example.index.domain;

import com.example.index.BaseEntity;
import com.example.index.domain.enums.IndependentPostType;
import com.example.index.domain.enums.RegionPostType;
import com.example.index.domain.enums.RegionType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "post", indexes = {
        @Index(name = "idx_post_createdDate", columnList = "createdDate")
//        @Index(name = "idx_post_views", columnList = "views")
})
public class Post extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "post_id")
    private Long id;
    private String title;
    private int views; // 조회수

    @Column(columnDefinition = "text") // 텍스트 타입
    private String content;

    @Enumerated(EnumType.STRING)
    private IndependentPostType independentPostType; // 자취 게시판 카테고리

    @Enumerated(EnumType.STRING)
    private RegionType regionType; // 지역 게시판 지역 정보

    @Enumerated(EnumType.STRING)
    private RegionPostType regionPostType; // 지역 게시판 카테고리

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

    @Builder
    public Post(String title, int views, String content, IndependentPostType independentPostType, RegionType regionType, RegionPostType regionPostType, Member member, LocalDateTime createdDate, LocalDateTime lastModifiedDate) {
        this.title = title;
        this.views = views;
        this.content = content;
        this.independentPostType = independentPostType;
        this.regionType = regionType;
        this.regionPostType = regionPostType;
        this.member = member;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }
}
