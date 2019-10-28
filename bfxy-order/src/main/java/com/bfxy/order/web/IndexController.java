package com.bfxy.order.web;

/*
 * @Author Wangjin
 * @Date 2019-03-05
 * @Email wangjin4901@vip.qq.com
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() throws Exception {
        System.out.println("----------");
        return "index";
    }
}
