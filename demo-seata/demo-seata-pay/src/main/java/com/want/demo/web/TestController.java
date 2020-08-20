package com.want.demo.web;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.want.demo.mapper.PayMapper;
import com.zdf.demo.entity.Account;

@RestController
@RequestMapping("/pay")
public class TestController {

	@Autowired
	private PayMapper payMapper;
	
	@RequestMapping("/createpay")
	public boolean createPay(@RequestParam("id") int id,@RequestParam("money") BigDecimal money) {
		Account account =new Account();
		account.setId(id);
		account.setMoney(money);
		payMapper.update(account);
		return true;
	}
}
