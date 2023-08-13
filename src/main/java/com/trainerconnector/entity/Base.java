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
@Table(name = "base")
@Entity
public class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED AUTO_INCREMENT COMMENT 'pk'")
    private BigInteger id;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(32) COMMENT '이름'")
    private String name;

    @Column(name = "phone_number", nullable = false, columnDefinition = "VARCHAR(11) COMMENT '유저 핸드폰 번호'")
    private String phoneNumber;

    @Column(name = "height", columnDefinition = "DECIMAL(4,1) COMMENT '키'")
    private Float height;

    @Column(name = "weight", columnDefinition = "DECIMAL(4,1) COMMENT '몸무게'")
    private Float weight;
    
}
