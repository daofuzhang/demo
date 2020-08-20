package com.want.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zdf.demo.entity.Goods;


@Mapper
public interface GoodsInvMapper {


	@Update("update goods set num = num - #{num} where id = #{id}")
	public boolean update(@Param("id") int id ,@Param("num") int num);

	@Select("select * from goods where id = #{goodsId}")
	public Goods findByGoodsId(@Param("goodsId") int goodsId);
	
}
