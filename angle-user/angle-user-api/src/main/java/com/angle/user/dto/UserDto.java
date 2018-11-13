package com.angle.user.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author YJ
 * @date 2018/11/13 11:56
 */
@Data
@ToString
public class UserDto  implements Serializable {
    private static final long serialVersionUID = -8618351021899461947L;
    private Long id;
    private String name;
    private Integer gender;


}
