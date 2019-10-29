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
    @ApiOperation(value="停车场数据每小时汇报", notes="停车场数据每小时汇报")
    public Result<Object> getCustomerByAge() {
        return Result.success(userService.test());
    }
}
