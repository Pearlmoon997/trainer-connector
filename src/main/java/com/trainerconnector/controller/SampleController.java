package com.trainerconnector.controller;

import com.trainerconnector.dto.common.SuccessResDto;
import com.trainerconnector.dto.sample.ReqDto;
import com.trainerconnector.service.SampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping(value = "/v1/sample")
@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/join")
    public SuccessResDto createOne(@RequestBody ReqDto body) {

        return sampleService.sample(body);
    }
}
