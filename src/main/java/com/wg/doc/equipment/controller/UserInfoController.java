package com.wg.doc.equipment.controller;

import com.wg.doc.base.domain.ResultVo;
import com.wg.doc.base.enums.StatusCode;
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
    public ResultVo<Object> getCustomerByAge() {
        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setData(userService.test());
        resultVo.setCode(StatusCode.SUCCESS.getCode());
        resultVo.setMsg(StatusCode.SUCCESS.getMessage());
        return resultVo;
    }
}
