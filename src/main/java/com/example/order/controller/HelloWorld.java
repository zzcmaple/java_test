package com.example.order.controller;

import com.example.order.biz.Test;
import com.example.order.entity.request.TradeOrderRequest;
import com.example.order.entity.response.TradeOrderResponse;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class HelloWorld {
    @Resource
    private Test test;

    @GetMapping("/hello")
    public String hello() {
        test.test();
        return "hello";
    }

    @PostMapping("/search")
    public String search(@RequestBody TradeOrderRequest request) {
        TradeOrderResponse response = new TradeOrderResponse();
        response.setOrderNo(request.getOrderNo());
        response.setPlatOrderNo("platOrderNo");
        return "!11";
    }
}
