package com.bfxy.store.service.provider;

/*
 * @Author Wangjin
 * @Date 2019-03-05
 * @Email wangjin4901@vip.qq.com
 */

import com.alibaba.dubbo.config.annotation.Service;
import com.bfxy.store.service.api.HelloServiceApi;
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class HelloServiceProvider implements HelloServiceApi {
    @Override
    public String sayHello(String name) {
        System.err.println("--------name:" + name);
        return "hello" + name;
    }
}
