package com.github.Is0x4096.demoone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;

/**
 * @author 0x4096.peng@gmail.com
 * @date 2020/10/28
 */
@RestController
public class OneController {

    @Value("${spring.test.name}")
    private String name;

    @RequestMapping(value = "/test")
    public String test() {
        return "one" + Clock.systemDefaultZone().millis() + name;
    }

}
