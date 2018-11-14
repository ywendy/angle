package com.angle.common.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author aaa
 */

public class ApiResult<T> {
    @ApiModelProperty(name = "code",value="返回码",notes="响应码", required=true, dataType="int")
    private int code;
    @ApiModelProperty(name = "message",value="错误信息",notes="错误信息", required=true, dataType="String")
    private String message;

    private T data;

   public ApiResult(int code,String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public ApiResult(ApiResultCode apiResultCode,T data){
      this(apiResultCode.getCode(),apiResultCode.getMessage(),data);
    }

    public static <T> ApiResult success(T data){

        return new ApiResult(ApiResultCode.SUCCESS,data);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
