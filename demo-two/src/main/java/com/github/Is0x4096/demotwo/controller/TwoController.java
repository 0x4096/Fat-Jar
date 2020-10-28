package com.github.Is0x4096.demotwo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;

/**
 * @author 0x4096.peng@gmail.com
 * @date 2020/10/28
 */
@RestController
public class TwoController {

    @RequestMapping(value = "/test")
    public String test() {
        return "two" + Clock.systemDefaultZone().millis();
    }

}
