package com.xzh.springcloud.service.impl;

import com.xzh.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import java.util.UUID;

@EnableBinding(Source.class)
@Slf4j
public class MessageProviderImpl implements IMessageProvider {

    @Autowired
    private MessageChannel output;


    @Override
    public String send() {
        String payload = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(payload).build());
        log.info("payload:{}", payload);
        return null;
    }
}
