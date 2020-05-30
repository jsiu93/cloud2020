package com.xzh.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class PaymentService {

    public String paymentInfoOK(Integer id) {
        return Thread.currentThread().getName() + "id: " + id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfoTimoutHandler",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")})
    public String paymentInfoTimeout(Integer id) {

        int sleepTime = 5;
        try {
            TimeUnit.SECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName() + "id: " + id + " 耗时：" + sleepTime;
    }

    public String paymentInfoTimoutHandler(Integer id) {
        return Thread.currentThread().getName() + "id: " + id + " 👿";
    }
}
