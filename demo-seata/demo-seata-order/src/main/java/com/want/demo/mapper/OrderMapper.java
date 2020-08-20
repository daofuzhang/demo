package com.want.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.zdf.demo.entity.Order;

@Mapper
public interface OrderMapper {

	@Insert("insert into order values(#{id},#{goodsid})")
	public boolean insert(Order order);
	
	
	
}
