package com.want.demo.mapper;


import java.math.BigDecimal;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zdf.demo.entity.Account;


@Mapper
public interface PayMapper {

	@Update("update account set money = #{money}  where id = #{id}")
	public boolean update(Account account);
	
	@Select("select money from account where id = #{id}")
	public BigDecimal getMoneyById(@Param(value = "id") int id);
	
	
}
