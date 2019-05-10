package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @program: sell
 * @description: 商品(包含类目)
 * @author: Ming.Li
 * @create: 2019-05-09 11:51
 **/
@Data
public class ProductVO<T> {
    @JsonProperty("name")
    private String productName;
    @JsonProperty("type")
    private String productType;
    @JsonProperty("foods")
    private List<T> productInfoVOList;

}
