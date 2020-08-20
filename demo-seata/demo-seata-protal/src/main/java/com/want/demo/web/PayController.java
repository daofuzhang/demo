package com.want.demo.web;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.want.demo.service.InvService;
import com.want.demo.service.OrderService;
import com.want.demo.service.PayService;
import com.zdf.demo.entity.Goods;
import com.zdf.demo.entity.PayDetail;

import io.seata.spring.annotation.GlobalTransactional;

@RestController
public class PayController {

	@Autowired
	private InvService invService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private PayService payService;
	
	@RequestMapping("/test2/{id}")
	@GlobalTransactional
	public PayDetail pay2(@PathVariable("id") int id) {
		int goodsId_apple = 1;
		int goodsId_oragle = 2;
		int orderId = id;
		int payId = id;
     //扣库存,获取商品信息
		invService.cut( 1,goodsId_apple);
		invService.cut( 1,goodsId_oragle);
		
		List<Goods> goods =new ArrayList<Goods>();
		Goods apple = invService.getById(goodsId_apple);
		Goods orangle = invService.getById(goodsId_oragle);
		goods.add(orangle);
		goods.add(apple);
     //写入订单
		orderService.createOrder(orderId, goodsId_apple);
		orderService.createOrder(orderId, goodsId_oragle);
		
      // 支付
		BigDecimal applePrice = apple.getPrice();
		BigDecimal oranglePrice = apple.getPrice();
		
		payService.createPay(payId, applePrice.add(oranglePrice));
		
		
	  //结果
		PayDetail detail=new PayDetail();
		detail.setAccountId(payId);
		detail.setPaydate(new Date());
		detail.setOrderid(orderId);
		detail.setMoney(applePrice.add(oranglePrice));
		detail.setGoods(goods);
		
		return detail;
	}
	
	
	
	@RequestMapping("/test")
	@GlobalTransactional
	public PayDetail pay() {
		
		int goodsId_apple = 1;
		int goodsId_oragle = 2;
		int orderId = 1;
		int payId = 1;
     //扣库存,获取商品信息
		invService.cut(goodsId_apple, 1);
		invService.cut(goodsId_oragle, 1);
		
		List<Goods> goods =new ArrayList<Goods>();
		Goods apple = invService.getById(goodsId_apple);
		Goods orangle = invService.getById(goodsId_oragle);
		goods.add(orangle);
		goods.add(apple);
     //写入订单
		orderService.createOrder(orderId, goodsId_apple);
		orderService.createOrder(orderId, goodsId_oragle);
		
      // 支付
		BigDecimal applePrice = apple.getPrice();
		BigDecimal oranglePrice = apple.getPrice();
		
		payService.createPay(payId, applePrice.add(oranglePrice));
		
		
	  //结果
		PayDetail detail=new PayDetail();
		detail.setAccountId(payId);
		detail.setPaydate(new Date());
		detail.setOrderid(orderId);
		detail.setMoney(applePrice.add(oranglePrice));
		detail.setGoods(goods);
		
		return detail;
	}
	
}
