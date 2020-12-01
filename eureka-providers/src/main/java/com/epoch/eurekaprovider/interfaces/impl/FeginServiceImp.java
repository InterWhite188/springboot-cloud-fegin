package com.epoch.eurekaprovider.interfaces.impl;

import com.epoch.eurekaprovider.interfaces.FeignService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：dangsk
 * @date ：Created in 2020/9/6 16:44
 * @description：
 * @modified By：
 * @version: $
 */
public class FeginServiceImp implements FeignService {
    @Override
    public String getP(@RequestBody String str) {
        System.out.println("");
        return "";
    }
}
