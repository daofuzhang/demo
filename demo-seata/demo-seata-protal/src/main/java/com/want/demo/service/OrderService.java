package com.want.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="demo-seata-order")
public interface OrderService {

	@GetMapping("/order/createorder")
	public boolean createOrder(@RequestParam("id") int id,@RequestParam("goodid") int goodid);
}
