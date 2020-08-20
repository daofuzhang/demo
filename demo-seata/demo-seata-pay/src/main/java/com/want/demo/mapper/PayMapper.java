package com.want.demo.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.zdf.demo.entity.Account;


@Mapper
public interface PayMapper {

	@Update("update account set money = #{money}  where id = #{id}")
	public boolean update(Account account);
	
	
}
