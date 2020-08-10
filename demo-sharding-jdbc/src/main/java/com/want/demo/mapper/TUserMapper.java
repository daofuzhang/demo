package com.want.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.want.demo.model.T_User;

@Mapper
public interface TUserMapper {

	@Insert("insert into t_user values(#{id},#{name},#{birthday})")
	public void insert(T_User t_user);
	@Select("select * from t_user")
	public List<T_User> findAll();
}
