package com.imooc.controller;

import com.imooc.VO.ProductInfoVO;
import com.imooc.VO.ProductVO;
import com.imooc.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: sell
 * @description: 买家商品-api
 * @author: Ming.Li
 * @create: 2019-05-09 11:33
 **/
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();
        ProductVO productVO = new ProductVO();
        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
        resultVO.setCode(200);
        resultVO.setMsg("成功");
        resultVO.setData(Arrays.asList(productVO));
        return  resultVO;

    }

}
