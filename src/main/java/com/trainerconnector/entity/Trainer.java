package com.trainerconnector.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "trainer")
@Entity
public class Trainer {

    @EmbeddedId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "base_id", nullable = false, columnDefinition = "BIGINT UNSIGNED COMMENT 'base fk'")
    private Base base;

    //TODO: 이미지 어떻게할꺼야 누나? local로 할꺼면 누나가 방법 알려줘야함, S3로 할꺼면 내가.
    @Column(name = "profile_image", columnDefinition = "VARCHAR(512) COMMENT '프로필 이미지'")
    private String profileImage;

    @Column(name = "career", columnDefinition = "VARCHAR(1024) COMMENT '경력'")
    private String career;

    @Column(name = "is_approved", columnDefinition = "BIT(1) DEFAULT 0 COMMENT '승인여부'")
    private Boolean isApproved;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id", nullable = false, columnDefinition = "BIGINT UNSIGNED COMMENT '헬스장 FK'")
    private Shop shop;
}
