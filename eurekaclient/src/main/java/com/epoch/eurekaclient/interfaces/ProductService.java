package com.epoch.eurekaclient.interfaces;

/**
 * @author ：dangsk
 * @date ：Created in 2020/9/8 20:00
 * @description：
 * @modified By：
 * @version: $
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YangPeng
 * @Title: ProductService
 * @ProjectName springbootdemo
 * @Description: TODO
 * @date 2019/3/27-11:23
 */
//name 为product项目中application.yml配置文件中的application.name;
//path 为product项目中application.yml配置文件中的context.path;
@FeignClient(name = "product-server",path ="/product" )
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行；
@Component
public interface ProductService {
    @RequestMapping(value = "getProduct1")
    String getProduct();
}