package com.want.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zdf.demo.entity.Goods;

@FeignClient(name = "demo-seata-inv")
public interface InvService {

	@GetMapping(value="/inv/cutinv")
	public boolean cut(@RequestParam("num") int num,@RequestParam("goodsid") int goodsid);
	@GetMapping(value="/inv/findbyid")
	public Goods getById(@RequestParam("id") int id) ;
	
}
