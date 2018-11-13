package com.angle.user.api;

import com.angle.user.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author YJ
 * @date 2018/11/13 11:57
 */

@FeignClient("user")
public interface UserApi {

    /**
     * 根据用户Id查询用户信息
     * @param userId
     * @return {@link UserDto}
     */
     UserDto getUserById(@RequestParam("userId") Long userId);

}
