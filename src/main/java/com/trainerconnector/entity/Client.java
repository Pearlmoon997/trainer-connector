package com.trainerconnector.entity;

import com.trainerconnector.entity.enums.Purpose;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "client")
@Entity
public class Client {

    @EmbeddedId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "base_id", nullable = false, columnDefinition = "BIGINT UNSIGNED COMMENT 'base fk'")
    private Base base;

    @Column(name = "warning", columnDefinition = "VARCHAR(1024) COMMENT '질병정보'")
    private String warning;

    @Column(name = "e_purpose", nullable = false, columnDefinition = "VARCHAR(16) COMMENT '운동목적'")
    @Enumerated(EnumType.STRING)
    private Purpose purpose;

    @Column(name = "pt_count", nullable = false, columnDefinition = "INT DEFAULT 0 COMMENT '피티 횟수'")
    private Long ptCount;

    @Column(name = "completed_count", columnDefinition = "INT COMMENT 'pt 완료 횟수'")
    private Long completedCount;


}
