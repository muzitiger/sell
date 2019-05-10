package com.imooc.service;

import com.imooc.dataObject.ProductCategory;

import java.util.List;

/**
 * @program: sell
 * @description: 买家类目
 * @author: Ming.Li
 * @create: 2019-05-08 11:35
 **/
public interface ProductCategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
