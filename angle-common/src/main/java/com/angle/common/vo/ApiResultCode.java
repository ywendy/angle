package com.angle.common.vo;

public enum ApiResultCode {

    SUCCESS(0,"success");
    private int code;
    private String message;
    ApiResultCode(int code,String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }


}
