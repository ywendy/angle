package com.angle.user.util;

import com.angle.user.dto.UserDto;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author YJ
 * @date 2018/11/13 13:21
 */
public class UserCache {

    public static Map<Long, UserDto> userCache = new ConcurrentHashMap<>();

    static {
        UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setGender(1);
        userDto.setName("tony");
        userCache.put(1L,userDto);
    }

    public static UserDto getUserById(Long id){
        return userCache.get(id);
    }

}
