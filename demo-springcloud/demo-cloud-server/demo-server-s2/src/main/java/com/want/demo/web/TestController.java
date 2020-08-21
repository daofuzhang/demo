package com.want.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/s2")
@Api(tags="测试模块S2")
public class TestController {

	@RequestMapping("/test01")
	@ApiOperation("测试模块s2-test01")
	public String test01() {
		return "demo-server-s2 test01";
	}

	@RequestMapping("/test02/{obj}")
	public String test02(@PathVariable String obj) {
		return "demo-server-s2 test02";
	}
	
	@RequestMapping("/test03")
	@ApiOperation("测试模块s2-test03")
	@ApiParam("入参")
	public String test03(@RequestParam("obj") String obj) {
		return "demo-server-s2 test02";
	}
	
}
