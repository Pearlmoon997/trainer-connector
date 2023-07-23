package com.trainerconnector.service.impl;

import com.trainerconnector.dto.common.SuccessResDto;
import com.trainerconnector.dto.sample.ReqDto;
import com.trainerconnector.repository.UserRepository;
import com.trainerconnector.service.SampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional(rollbackFor = Exception.class)
@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {

    private final UserRepository userRepository;

    @Override
    public SuccessResDto sample(ReqDto body) {

        userRepository.findIdByPhoneNumber("01011111111");

        return null;
    }
}
