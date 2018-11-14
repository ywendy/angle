package com.angle.user.dto;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(value="主键",notes="主键，隐藏", required=true, dataType="Long")
    private Long id;
    @ApiModelProperty(value="用户名",notes="用户名", required=true, dataType="String")
    private String name;
    @ApiModelProperty(value="性别",notes = "1:男，2：女",required=true, dataType="Integer")
    private Integer gender;


}
