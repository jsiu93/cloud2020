package com.xzh.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "PaymenFallbackService fall back, paymentInfoOk ";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymenFallbackService fall back, paymentInfo_TimeOut ";
    }
}
