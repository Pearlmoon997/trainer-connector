package com.trainerconnector.entity;

import com.trainerconnector.entity.enums.ExerciseTarget;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "exercise")
@Entity
public class Exercise {

    //NOTE: target을 enum화 (등, 하체, 가슴, 어깨, 전신), subTarget은 세부항목 (광배, 대퇴사두, 전면어깨, 대흉근,,,)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED AUTO_INCREMENT COMMENT 'pk'")
    private BigInteger id;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(64) COMMENT '운동명'")
    private String name;

    @Column(name = "e_target", nullable = false, columnDefinition = "VARCHAR(12) COMMENT '타겟부위'")
    @Enumerated(EnumType.STRING)
    private ExerciseTarget target;

    @Column(name = "sub_target", columnDefinition = "VARCHAR(128) COMMENT '협력근'")
    private String subTarget;
}
