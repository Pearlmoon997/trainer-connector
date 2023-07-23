package com.trainerconnector.service;

import com.trainerconnector.dto.common.SuccessResDto;
import com.trainerconnector.dto.user.JoinReqDto;
import com.trainerconnector.dto.user.UserDetailResDto;

public interface UserService {

    SuccessResDto join(JoinReqDto body);

    UserDetailResDto getOne(String phoneNumber);
}
