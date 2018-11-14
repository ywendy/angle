package com.angle.user.api;

import com.angle.common.vo.ApiResult;
import com.angle.user.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author YJ
 * @date 2018/11/13 11:57
 */

@FeignClient("user")
public interface UserApiClient {


    /**
     * 根据userId查询用户信息
     * @param userId
     * @return
     */
     ApiResult<UserDto> getUserDtoById(@RequestParam("userId") Long userId);

}
