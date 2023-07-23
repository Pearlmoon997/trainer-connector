package com.trainerconnector.entity;

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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED AUTO_INCREMENT COMMENT 'pk'")
    private BigInteger id;

    private String name;

    @Column(name = "phone_number", nullable = false, columnDefinition = "VARCHAR(11) COMMENT '유저 핸드폰 번호'")
    private String phoneNumber;
}
