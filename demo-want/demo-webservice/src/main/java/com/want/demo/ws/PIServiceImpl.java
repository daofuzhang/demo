package com.want.demo.ws;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

@Component
@WebService(targetNamespace = "http://want-want.com/ws", 
            endpointInterface = "com.want.demo.ws.PIService", 
            name = "piPortType", // portType名称																														// 为接口名称
		    serviceName = "pIService", // 服务name名称
		    portName = "piPortName" // port名称
)
public class PIServiceImpl implements PIService {

	@Override
	public String execute(String param) {

		return "ok";
	}

}
