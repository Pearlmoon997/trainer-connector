package com.trainerconnector.entity;

import com.trainerconnector.entity.enums.Purpose;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "user")
@Entity
public class User {

    // pk, name, birth, contact_number, height,
    // weight, warning(질병정보), e_purpose(바디프로필, 다이어트, 건강),
    // pt_count, completed_count, address, trainer_id(FK), promotion_id(FK)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED AUTO_INCREMENT COMMENT 'pk'")
    private BigInteger id;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(32) COMMENT '이름'")
    private String name;

    @Column(name = "birth", columnDefinition = "VARCHAR(11) COMMENT '생일'")
    private String birth;

    @Column(name = "phone_number", nullable = false, columnDefinition = "VARCHAR(11) COMMENT '유저 핸드폰 번호'")
    private String phoneNumber;

    @Column(name = "height", columnDefinition = "DECIMAL(4,1) COMMENT '키'")
    private Float height;

    @Column(name = "weight", columnDefinition = "DECIMAL(4,1) COMMENT '몸무게'")
    private Float weight;

    @Column(name = "warning", columnDefinition = "VARCHAR(1024) COMMENT '질병정보'")
    private String warning;

    @Column(name = "e_purpose", nullable = false, columnDefinition = "VARCHAR(16) DEFAULT 'DIET' COMMENT '운동목적'")
    @Enumerated(EnumType.STRING)
    private Purpose purpose;

    @Column(name = "pt_count", nullable = false, columnDefinition = "INTEGER DEFAULT '0' COMMENT '피티 횟수'")
    private Long ptCount;

    @Column(name = "complete_count", nullable = false, columnDefinition = "INTEGER DEFAULT '0' COMMENT '피티 완료 횟수")
    private Long completedCount;

    @Column(name = "address", columnDefinition = "VARCHAR(128) COMMENT '주소'")
    private String address;
}
