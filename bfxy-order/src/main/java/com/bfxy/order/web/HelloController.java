package com.bfxy.order.web;

/*
 * @Author Wangjin
 * @Date 2019-03-05
 * @Email wangjin4901@vip.qq.com
 */

import com.alibaba.dubbo.config.annotation.Reference;
import com.bfxy.store.service.api.HelloServiceApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference(
            version = "1.0.0",
            application = "${dubbo.application.id}",
            interfaceName = "com.bfxy.store.service.api.HelloServiceApi",
            check = false,
            timeout = 3000,
            retries = 0 // 读请求允许重试3尺, 写请求没有幂等不要重试
    )
    private HelloServiceApi helloServiceApi;

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name) throws Exception {
        System.err.println("--------");
        return helloServiceApi.sayHello(name);
    }
}
