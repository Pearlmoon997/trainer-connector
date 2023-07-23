package com.trainerconnector.service;

import com.trainerconnector.dto.common.SuccessResDto;
import com.trainerconnector.dto.sample.ReqDto;

public interface SampleService {

    SuccessResDto sample(ReqDto body);
}
