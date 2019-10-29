package com.wg.doc.equipment.controller;

import com.wg.doc.base.result.Result;
import com.wg.doc.equipment.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "user", tags = { "user" })
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    @ApiOperation(value="user", notes="user")
    public Object getCustomerByAge() {
        return userService.test();
    }
}
