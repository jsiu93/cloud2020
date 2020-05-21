package com.xzh.springcloud.dao;

import com.xzh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getById(@Param("id") Long id);
}
