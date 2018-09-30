package com.imooc.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 *
 * @create 2018-09-29 11:15
 * @copyright huxiaolei1997@gmail.com
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;


    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;


}
