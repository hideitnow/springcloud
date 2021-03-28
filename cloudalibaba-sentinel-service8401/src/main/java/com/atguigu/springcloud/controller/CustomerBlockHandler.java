package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author zhanghao
 * @date 2021/3/27 10:11
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception){
        return new CommonResult(555, "自定义的限流处理信息...CustomerBlockHandler");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(555, "自定义的限流处理信息2...CustomerBlockHandler2");
    }
}
