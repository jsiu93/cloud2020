package com.xzh.springcloud.controller;

import com.xzh.springcloud.entities.Payment;
import com.xzh.springcloud.entities.R;
import com.xzh.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("consumer/payment/get/{id}")
    public R<Payment> getById(@PathVariable("id") Long id) {
        return this.paymentFeignService.getById(id);
    }

    @GetMapping("consumer/payment/timeout")
    public R timeout() {
        return this.paymentFeignService.timeout();
    }
}


