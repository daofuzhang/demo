package com.zdf.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "test";
	}
}
