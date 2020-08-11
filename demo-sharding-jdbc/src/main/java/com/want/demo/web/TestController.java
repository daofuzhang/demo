package com.want.demo.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.want.demo.mapper.TUserMapper;
import com.want.demo.model.T_User;

@RestController
public class TestController {

	@Autowired
	private TUserMapper tUserMapper;
	
	@RequestMapping("/add")
	public String insert() {
		T_User user=new T_User();
		user.setBirthday(new Date());
		user.setId(1);
		user.setName("tom");
		tUserMapper.insert(user);
		return "S";
	}
	@RequestMapping("/search")
	public List<T_User> search(){
		
		return tUserMapper.findAll();
	}
}
