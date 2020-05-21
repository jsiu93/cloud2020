package com.xzh.springcloud.controller;

import com.xzh.springcloud.entities.Payment;
import com.xzh.springcloud.entities.R;
import com.xzh.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    //    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;


    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("payment/create")
    public R create(@RequestBody Payment payment) {
        int i = this.paymentService.create(payment);
        if (i > 0) {
            return new R(200, "success, " + port, i);
        } else {
            return new R(444, "fail", null);
        }
    }

    @GetMapping("payment/get/{id}")
    public R<Payment> getById(@PathVariable("id") Long id) {
        Payment payment = this.paymentService.getById(id);
        if (payment != null) {
            return new R(200, "success, " + port, payment);
        } else {
            return new R(444, "fail", null);
        }
    }

}
