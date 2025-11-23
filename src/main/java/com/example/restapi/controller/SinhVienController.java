package com.example.restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SinhVienController {
    @RequestMapping("/lab4-bai3")
    public String testAxios() {
        return "/student-crud";
    }
}
