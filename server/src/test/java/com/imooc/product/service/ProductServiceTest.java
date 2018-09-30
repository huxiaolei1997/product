package com.imooc.product.service;

import com.imooc.product.dto.CartDTO;
import com.imooc.product.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        System.out.println(productInfoList.toString());
    }

    @Test
    public void findList() {
        List<ProductInfo> list = productService.findList(Arrays.asList("157875196366160022", "157875227953464068", "164103465734242707"));
        System.out.println(list.toString());
    }

    @Test
    public void decreaseStock() {
        CartDTO cartDTO = new CartDTO("157875196366160022", 2);
        productService.decreaseStock(Arrays.asList(cartDTO));
    }
}