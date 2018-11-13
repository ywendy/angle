package com.angle.user.controller;

import com.angle.user.api.UserApi;
import com.angle.user.dto.UserDto;
import com.angle.user.util.UserCache;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YJ
 * @date 2018/11/13 13:18
 */
@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController implements UserApi {

    @Value("${name}")
    private String userName;

    @Override
    @GetMapping("/getUserById")
    public UserDto getUserById(@RequestParam("userId") Long userId) {
        UserDto userDto =  UserCache.getUserById(userId);
        userDto.setName(userName);
        return userDto;
    }
}
