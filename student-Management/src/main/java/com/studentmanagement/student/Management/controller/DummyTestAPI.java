package com.studentmanagement.student.Management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DummyTestAPI {

    @GetMapping
    public String DummyTest(){
        return  "Hello World....! API";
    }


}
