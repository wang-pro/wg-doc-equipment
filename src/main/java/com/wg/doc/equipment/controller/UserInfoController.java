package com.wg.doc.equipment.controller;

import com.wg.doc.base.domain.ResultVo;
import com.wg.doc.base.enums.StatusCode;
import com.wg.doc.equipment.entity.EquipmentInfo;
import com.wg.doc.equipment.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "user", tags = { "user" })
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/{id}")
    @ApiOperation(value="停车场数据每小时汇报", notes="停车场数据每小时汇报")
    @ApiImplicitParam(paramType = "path", dataType = "Long", name = "id", value = "id", required = true)
    public ResultVo<Object> getCustomerByAge(@PathVariable long id) {
        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setData(userInfoService.getUser(id));
        resultVo.setCode(StatusCode.SUCCESS.getCode());
        resultVo.setMsg(StatusCode.SUCCESS.getMessage());
        return resultVo;
    }
}
