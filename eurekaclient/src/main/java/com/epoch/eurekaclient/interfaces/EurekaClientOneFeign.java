package com.epoch.eurekaclient.interfaces;

/**
 * @author ：dangsk
 * @date ：Created in 2020/9/8 20:00
 * @description：
 * @modified By：
 * @version: $
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  value为eureka-client-one注册时的 spring.application.name
 */
//@FeignClient(value = "eureka-client-one")
public interface EurekaClientOneFeign {
    /**
     * eureka-client-one的helloworld访问mapping
     */
    @RequestMapping("/")
    String home();
}