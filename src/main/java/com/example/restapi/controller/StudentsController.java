package com.example.restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentsController {
    @RequestMapping("/test-axios")
    public String testAxios() {
        return "/student/test-axios";
    }
}
