package com.imooc.service.Impl;

import com.imooc.dataObject.ProductCategory;
import com.imooc.service.ProductCategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: sell
 * @description: 买家类目测试
 * @author: Ming.Li
 * @create: 2019-05-08 11:41
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

   @Autowired
   private ProductCategoryService service;
    @Test
    public void findOne() {
        ProductCategory one = service.findOne(1);
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findByCategoryTypeIn() {
    }

    @Test
    public void save() {
    }
}