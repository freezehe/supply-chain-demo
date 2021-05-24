package com.jiuyv.supplychain.enums;

/**
 * <p>Title: RespEnum</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2020年8月24日 下午3:56:12
 */

public enum RespEnum {
	
	SUCCESS(0,"success"),
	UNKNOW_EXCEPTION(10000,"系统繁忙，请稍后再试"),
    VAILD_EXCEPTION(10001,"参数格式校验失败");
    
	
    private int code;
    private String msg;
    RespEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
