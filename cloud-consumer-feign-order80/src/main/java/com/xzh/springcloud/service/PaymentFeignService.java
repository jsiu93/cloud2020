package com.xzh.springcloud.service;

import com.xzh.springcloud.entities.Payment;
import com.xzh.springcloud.entities.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("payment/get/{id}")
    R<Payment> getById(@PathVariable("id") Long id);


    @GetMapping("payment/timeout")
    R timeout();
}
