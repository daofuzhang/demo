package com.want.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.want.demo.mapper.OrderMapper;
import com.zdf.demo.entity.Order;

@RestController("/order")
public class TestController {

	@Autowired
	private OrderMapper orderMapper;
	@RequestMapping("/createorder")
	public boolean save() {
		Order order = new Order();
		order.setId(1);
		order.setGoodsid(1);
		return orderMapper.insert(order);
	}
}
