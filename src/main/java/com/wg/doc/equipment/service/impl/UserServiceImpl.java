package com.wg.doc.equipment.service.impl;

import com.wg.doc.equipment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Object test() {
        return restTemplate.getForObject("http://DOC-USER/doc-user-api/user/1",Object.class);
    }
}
