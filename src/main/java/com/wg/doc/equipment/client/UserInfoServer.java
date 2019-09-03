package com.wg.doc.equipment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "doc-user")
public interface UserInfoServer {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    Object  getUser(@PathVariable Long id);
}
