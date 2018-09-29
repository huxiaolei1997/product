package com.imooc.product.vo;

import lombok.Data;

/**
 * ResultVO
 * http 请求返回的最外层对象
 *
 * @create 2018-09-29 11:14
 * @copyright huxiaolei1997@gmail.com
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码，正常返回 0
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;


}
