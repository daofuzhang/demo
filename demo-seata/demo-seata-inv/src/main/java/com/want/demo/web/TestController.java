package com.want.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.want.demo.mapper.GoodsInvMapper;
import com.zdf.demo.entity.Goods;


@RestController("/inv")
public class TestController {

	@Autowired
	private GoodsInvMapper goodsInvMapper;

	@RequestMapping("/cutinv")
	public boolean cut(int num,int goodsid) throws Exception {
		Goods findByGoodsId = goodsInvMapper.findByGoodsId(goodsid);
		if (findByGoodsId.getNum() <= 0) {
			throw  new Exception();
		}
		return goodsInvMapper.update(goodsid, num);
	}
}
