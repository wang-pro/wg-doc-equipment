package com.wg.doc.equipment.service;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@EnableFeignClients
@FeignClient(value = "doc-user")
public interface UserInfoService {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    Object  getUser(@PathVariable Long id);
}
