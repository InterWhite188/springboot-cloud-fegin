package com.epoch.eurekaclient.controller;

import com.epoch.eurekaclient.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：dangsk
 * @date ：Created in 2020/11/1 23:49
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class ConsumerController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "getConsumer")
    public String getConsumer(){
        String str =  productService.getProduct();
        return str;
    }
}