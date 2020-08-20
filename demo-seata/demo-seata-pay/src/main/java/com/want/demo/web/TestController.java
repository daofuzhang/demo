package com.want.demo.web;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.want.demo.mapper.PayMapper;
import com.zdf.demo.entity.Account;

@RestController("/pay")
public class TestController {

	@Autowired
	private PayMapper payMapper;
	
	@RequestMapping("/pay")
	public boolean pay() {
		Account account =new Account();
		account.setId(1);
		account.setMoney(new BigDecimal(0));
		payMapper.update(account);
		return true;
	}
}
