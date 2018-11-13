package com.angle.common.vo;

/**
 *
 */
public class ApiResult<T> {
    private int code;
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
