package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author xiaolei hu
 * @date 2018/9/28 21:47
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() {
       List<ProductInfo> list =  productInfoRepository.findByProductStatus(0);
        System.out.println(list.toString());
    }

    @Test
    public void findByProductIdIn() {
        List<ProductInfo> list =  productInfoRepository.findByProductIdIn(Arrays.asList("157875196366160022", "157875227953464068", "164103465734242707"));
        System.out.println(list.toString());
    }
}