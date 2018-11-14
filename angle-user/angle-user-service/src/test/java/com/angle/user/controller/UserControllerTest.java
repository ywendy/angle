package com.angle.user.controller;

import com.angle.common.vo.ApiResultCode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author YJ
 * @date 2018/11/14 10:42
 */

public class UserControllerTest extends BaseControllerTest{

    @Test
    public void whenGetUserDtoByIdSuccess() throws Exception {

         mockMvc.perform(get("/user/1")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                 .andExpect(jsonPath("$.code").value(ApiResultCode.SUCCESS.getCode()))
                .andExpect(jsonPath("$.data.id").value(1L))
                .andExpect(jsonPath("$.data.gender").value(1));
    }
}