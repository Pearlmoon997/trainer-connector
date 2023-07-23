package com.trainerconnector.repository;

import com.trainerconnector.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserRepository extends JpaRepository<User, BigInteger> {

    BigInteger findIdByPhoneNumber(String phoneNumber);
}
