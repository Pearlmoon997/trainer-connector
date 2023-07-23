package com.trainerconnector.controller;

import com.trainerconnector.dto.common.SuccessResDto;
import com.trainerconnector.dto.user.JoinReqDto;
import com.trainerconnector.dto.user.UserDetailResDto;
import com.trainerconnector.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping(value = "/v1/users")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/join")
    public SuccessResDto join(@RequestBody JoinReqDto body) {
        return userService.join(body);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("{phoneNumber}")
    public UserDetailResDto getOne(@PathVariable String phoneNumber) {
        return userService.getOne(phoneNumber);
    }
}
