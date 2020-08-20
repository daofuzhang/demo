package com.want.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.zdf.demo.entity.Goods;


@Mapper
public interface GoodsInvMapper {


	@Update("update goods set num = #{num} where id = #{id}")
	public boolean update(int id ,int num);

	@Select("select * form goods where id = #{goodsId}")
	public Goods findByGoodsId(int goodsId);
	
}
