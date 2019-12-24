package com.qingfeng.qingblog.vo;

import lombok.Data;

import java.util.Map;

@Data
public class ResultVO {
    private int code;

    private String message;

    private Map<String,String> data;

    public ResultVO(int code,String message){
        this.code = code;
        this.message = message;
        this.data = null;
    }
}
