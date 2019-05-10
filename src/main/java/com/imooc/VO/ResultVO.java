package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @program: sell
 * @description: http请求返回实体类
 * @author: Ming.Li
 * @create: 2019-05-09 11:46
 **/
@Data
public class ResultVO<T> {
    /*错误码*/
    private Integer code;
    /*错误信息*/
    private String msg;
    /*具体内容*/
    private T data;
}
