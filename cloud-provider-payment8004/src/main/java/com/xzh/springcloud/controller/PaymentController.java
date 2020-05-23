package com.xzh.springcloud.controller;

import cn.hutool.core.codec.Base64;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        String str = "vmess://eyJwb3J0IjoiNDQzIiwicHMiOiJqczduLnh5eiIsInRscyI6InRscyIsImlkIjoiYmIzNTc5NGItZjJhNS00YjU3LTllNzMtNGNmYWUyYTVhNTJlIiwiYWlkIjoiMjMzIiwidiI6IjIiLCJob3N0IjoianM3bi54eXoiLCJ0eXBlIjoibm9uZSIsInBhdGgiOiJcLyIsIm5ldCI6IndzIiwiYWRkIjoianM3bi54eXoifQ==\n" +
                "vmess://eyJwb3J0IjoiNDQzIiwicHMiOiIxdTc0N3kueHl6IiwidGxzIjoidGxzIiwiaWQiOiI2YTc5MmNmYy05ZjBiLTQ3ZDMtYWI5Yi04MzJiMjc5MDFmYjYiLCJhaWQiOiIyMzMiLCJ2IjoiMiIsImhvc3QiOiIxdTc0N3kueHl6IiwidHlwZSI6Im5vbmUiLCJwYXRoIjoiXC8iLCJuZXQiOiJ3cyIsImFkZCI6IjF1NzQ3eS54eXoifQ==\n" +
                "vmess://eyJwb3J0IjoiNDQzIiwicHMiOiI1MWJiOC54eXoiLCJ0bHMiOiJ0bHMiLCJpZCI6IjhhYTY5NjJhLTE0ZDktNDIzYS04N2E2LWJjYjc2ZmRlZDI1ZSIsImFpZCI6IjIzMyIsInYiOiIyIiwiaG9zdCI6IjUxYmI4Lnh5eiIsInR5cGUiOiJub25lIiwicGF0aCI6IlwvIiwibmV0Ijoid3MiLCJhZGQiOiI1MWJiOC54eXoifQ==\n" +
                "vmess://eyJwb3J0IjoiNDQzIiwicHMiOiJkbGxtY2xzLnh5eiIsInRscyI6InRscyIsImlkIjoiOWQxZGUyMWYtZjkzYy00ZDAwLWI0YmItNGZiOGZkMjVmOTBlIiwiYWlkIjoiMjMzIiwidiI6IjIiLCJob3N0IjoiZGxsbWNscy54eXoiLCJ0eXBlIjoibm9uZSIsInBhdGgiOiJcLyIsIm5ldCI6IndzIiwiYWRkIjoiZGxsbWNscy54eXoifQ==\n" +
                "vmess://eyJwb3J0IjoiNDQzIiwicHMiOiIyMDIwMDEwMy54eXoiLCJ0bHMiOiJ0bHMiLCJpZCI6IjczYjcwZjJiLWMzY2YtNGE3Ny1iNmI4LWE4ZWRmMmNlOTJiZSIsImFpZCI6IjIzMyIsInYiOiIyIiwiaG9zdCI6IjIwMjAwMTAzLnh5eiIsInR5cGUiOiJub25lIiwicGF0aCI6IlwvIiwibmV0Ijoid3MiLCJhZGQiOiIyMDIwMDEwMy54eXoifQ==";

        System.err.println(Base64.encode(str));
    }
}


