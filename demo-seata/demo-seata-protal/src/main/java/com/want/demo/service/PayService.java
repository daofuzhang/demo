package com.want.demo.service;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="demo-seata-pay")
public interface PayService {

	@GetMapping("/pay/createpay")
	public boolean createPay(@RequestParam("id") int id,@RequestParam("money") BigDecimal money) ;
}
