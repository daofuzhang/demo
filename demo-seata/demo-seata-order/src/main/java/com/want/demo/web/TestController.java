package com.want.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.want.demo.mapper.OrderMapper;
import com.zdf.demo.entity.Order;

@RestController
@RequestMapping("/order")
public class TestController {

	@Autowired
	private OrderMapper orderMapper;
	@RequestMapping("/createorder")
	public boolean createOrder(@RequestParam("id") int id,@RequestParam("goodid")  int goodid) {
		Order order = new Order();
		order.setId(id);
		order.setGoodsid(goodid);
		return orderMapper.insert(order);
	}
}
