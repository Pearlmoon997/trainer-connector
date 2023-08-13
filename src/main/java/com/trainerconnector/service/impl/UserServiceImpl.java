package com.trainerconnector.service.impl;

import com.trainerconnector.dto.common.SuccessResDto;
import com.trainerconnector.dto.user.JoinReqDto;
import com.trainerconnector.dto.user.UserDetailResDto;
import com.trainerconnector.entity.User;
import com.trainerconnector.repository.UserRepository;
import com.trainerconnector.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional(rollbackFor = Exception.class)
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public SuccessResDto join(JoinReqDto body) {

        String name = body.getName();
        String phoneNumber = body.getPhoneNumber();

        User user = new User();
        user.setPhoneNumber(phoneNumber);
        user.setName(body.getName());

        userRepository.save(user);

        return SuccessResDto.builder().success(true).build();
    }

    @Override
    public UserDetailResDto getOne(String phoneNumber) {

        User user = userRepository.findOneByPhoneNumber(phoneNumber);

        UserDetailResDto res = new UserDetailResDto();
        res.setName(user.getName());
        res.setPhoneNumber(user.getPhoneNumber());

        // 깃 테스트
        
        return res;
    }
}
