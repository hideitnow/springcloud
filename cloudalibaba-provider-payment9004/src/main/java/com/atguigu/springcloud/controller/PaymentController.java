package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author zhanghao
 * @date 2021/3/27 13:40
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L, "sgdgj23jh4jbh234"));
        hashMap.put(2L, new Payment(2L, "gdfhjskhldkkjlfd"));
        hashMap.put(3L, new Payment(3L, "3kj5kjsdkldsk3od"));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult commonResult = new CommonResult(200, "from mysql, serverPort = " + serverPort, payment);
        return commonResult;
    }
}
