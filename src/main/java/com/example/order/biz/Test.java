package com.example.order.biz;

import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class Test {
    public void test() {
        Instant now = Instant.now();
        System.out.println(now);
    }
}
