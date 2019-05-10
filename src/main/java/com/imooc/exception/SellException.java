package com.imooc.exception;

import com.imooc.Enums.ResultEnum;

/**
 * @program: sell
 * @description: 自定义异常类
 * @author: Ming.Li
 * @create: 2019-05-09 17:59
 **/
public class SellException extends RuntimeException {
    private Integer code;
    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }

}
