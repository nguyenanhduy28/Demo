package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String info(){

        String ten = "Nguyen Anh Duy";
        String mssv = "2280600458";
        String nhom = "Nhóm 3";
        String chu = "Hello world";

        return "Tên: " + ten +
               "<br>MSSV: " + mssv +
               "<br>" + nhom;
    }
}