/**  
* <p>Title: LoginController.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2010-2030</p>  
* <p>Company: xxx</p>  
* @author �ŵ���  
* @date 2020��8��2��  
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
