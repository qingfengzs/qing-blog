package com.qingfeng.qingblog.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

@Data
@ApiModel(description = "响应对象")
public class ResultVO {
    @ApiModelProperty(value = "响应码",name = "code",required = true,example = "" + 200)
    private int code;
    @ApiModelProperty(value = "响应信息",name = "message",required = true,example = "请求成功")
    private String message;
    @ApiModelProperty(value = "响应数据",name = "data",required = true,example = "succcess")
    private Map<String,String> data;

    public ResultVO(int code,String message){
        this.code = code;
        this.message = message;
        this.data = null;
    }
}
