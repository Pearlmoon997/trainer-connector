package com.trainerconnector.repository;

import com.trainerconnector.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserRepository extends JpaRepository<User, BigInteger> {

    User findOneByPhoneNumber(String phoneNumber);
}
