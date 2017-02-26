package com.qheeshow.eway.service.exception;

import com.qheeshow.eway.service.constant.ExceptionTypeEnum;

/**
 * Created by lihuajun on 17-1-22.
 */
public class CommonException extends Exception {

    private String code;
    private String desc;

    public CommonException(ExceptionTypeEnum exceptionTypeEnum) {
        this.code = exceptionTypeEnum.getCode();
        this.desc = exceptionTypeEnum.getDesc();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}