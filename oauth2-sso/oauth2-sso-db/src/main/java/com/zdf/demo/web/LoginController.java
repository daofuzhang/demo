/**  
* <p>Title: LoginController.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2010-2030</p>  
* <p>Company: xxx</p>  
* @author 张道付  
* @date 2020年8月2日  
* @version 1.0  
*/
package com.zdf.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
