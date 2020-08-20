package com.want.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.want.demo.mapper.GoodsInvMapper;
import com.zdf.demo.entity.Goods;


@RestController
@RequestMapping("/inv")
public class TestController {

	@Autowired
	private GoodsInvMapper goodsInvMapper;

	@GetMapping("/cutinv")
	public boolean cut(@RequestParam("num") int num,@RequestParam("goodsid") int goodsid) throws Exception {
		Goods findByGoodsId = goodsInvMapper.findByGoodsId(goodsid);
		if (findByGoodsId.getNum() <= 0) {
			throw  new Exception();
		}
		return goodsInvMapper.update(goodsid, num);
	}
	
	@GetMapping("/findbyid")
	public Goods getById(@RequestParam("id") int id) {
		return goodsInvMapper.findByGoodsId(id);
	}
}
