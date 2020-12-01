package com.epoch.eurekaprovider.interfaces;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name="testFegin")
public interface FeignService {

	@RequestMapping(value = "/list3",method = RequestMethod.POST,consumes = "application/json")
	@PostMapping
	String  getP(@RequestBody String str);
}