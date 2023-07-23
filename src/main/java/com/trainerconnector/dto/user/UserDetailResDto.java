package com.trainerconnector.dto.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserDetailResDto {

    private String name;

    private String phoneNumber;
}
