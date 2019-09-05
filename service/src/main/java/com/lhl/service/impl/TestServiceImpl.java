package com.lhl.service.impl;

import com.lhl.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return "test success";
    }
}
