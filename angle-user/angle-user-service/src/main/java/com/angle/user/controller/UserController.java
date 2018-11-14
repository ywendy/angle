package com.angle.user.controller;

import com.angle.common.vo.ApiResult;
import com.angle.user.api.UserApiClient;
import com.angle.user.dto.UserDto;
import com.angle.user.util.UserCache;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * @author YJ
 * @date 2018/11/13 13:18
 */
@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController  {

    @Value("${name}")
    private String userName;



    @ApiOperation(value = "根据Id获取用户",notes = "根据userId获取用户信息")
    @ApiImplicitParams(
            @ApiImplicitParam(value = "用户ID",required = true,dataType = "Long",paramType = "path")
    )
    @GetMapping("/{userId}")
    public ApiResult<UserDto> getUserDtoById(@PathVariable("userId") Long userId) {
        UserDto userDto =  UserCache.getUserById(userId);
        userDto.setName(userName);
        return ApiResult.success(userDto);
    }
}
