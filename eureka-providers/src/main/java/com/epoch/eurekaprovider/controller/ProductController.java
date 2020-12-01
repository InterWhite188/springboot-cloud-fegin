package com.epoch.eurekaprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：dangsk
 * @date ：Created in 2020/11/2 0:05
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class ProductController {
    @RequestMapping(value = "getProduct1")
    public String getProduct(String a){

        System.out.println("进入了生产者");
        return "进入了生产者";
    }
}
