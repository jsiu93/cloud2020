package com.xzh.springcloud.service.impl;

import com.xzh.springcloud.dao.PaymentDao;
import com.xzh.springcloud.entities.Payment;
import com.xzh.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return this.paymentDao.create(payment);
    }

    @Override
    public Payment getById(Long id) {
        return this.paymentDao.getById(id);
    }



}
