package com.example.technicalTest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pasindu on 3/7/19.
 */

@RestController
@RequestMapping("/api")
public class MainCon {

    @PostMapping("/post")
    public String post(@RequestBody String value){

        return value;
    }

}
