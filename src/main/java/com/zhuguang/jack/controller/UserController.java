package com.zhuguang.jack.controller;

import com.zhuguang.jack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUser")
    public @ResponseBody
    String queryUser(@RequestParam String areaCode) {
        return userService.queryUser(areaCode);
    }

    @RequestMapping("/exceptionTest")
    public @ResponseBody String exceptionTest() {
        String aa = null;
        aa.substring(0);
        return aa;
    }
}
