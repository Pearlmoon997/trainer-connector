package com.trainerconnector.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "shop")
@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED AUTO_INCREMENT COMMENT 'pk'")
    private BigInteger id;

    @Column(name = "code", nullable = false, columnDefinition = "VARCHAR(12) COMMENT 'code'")
    private String code;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(64) COMMENT '헬스장명'")
    private String name;

    @Column(name = "address1", nullable = false, columnDefinition = "VARCHAR(256) COMMENT '기본주소'")
    private String address1;

    @Column(name = "address2", columnDefinition = "VARCHAR(64) COMMENT '상세주소'")
    private String address2;

    @Column(name = "zip_code", nullable = false, columnDefinition = "VARCHAR(5) COMMENT '우편번호'")
    private String zipCode;

    @Column(name = "contact_number", columnDefinition = "VARCHAR(11) COMMENT '전화번호'")
    private String contactNumber;

    @Column(name = "manager_name", columnDefinition = "VARCHAR(32) COMMENT '담당자명'")
    private String managerName;
}
