package com.higeek.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("")
public class SystemController {

    @RequestMapping("")
    public String index(HttpServletRequest httpServletRequest) {
        String header = httpServletRequest.getHeader("user-agent");
        System.out.println("sssss"+header);
        if (header.indexOf("Android") != -1) {

            return "system/index/index1";

        } else if (header.indexOf("iPhone") != -1 || header.indexOf("iPad") != -1) {
            return "system/index/index1";



        } else {   // 电脑
            return "system/index/index";

      }



    }
}
