package com.epoch.eurekaclient.interfaces.impl;

/**
 * @author ：dangsk
 * @date ：Created in 2020/9/8 20:00
 * @description：
 * @modified By：
 * @version: $
 */

import com.epoch.eurekaclient.interfaces.EurekaClientOneFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  value为eureka-client-one注册时的 spring.application.name
 */
//@FeignClient(value = "eureka-client-one")
public class EurekaClientOneFeignIml implements EurekaClientOneFeign {

    @Override
    public String home() {
        System.out.println("");
        return "";
    }
}