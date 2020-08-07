package com.want.demo.ws;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

@Component
@WebService(targetNamespace = "http://want-want.com/ws", 
            endpointInterface = "com.want.demo.ws.PIService", 
            name = "piPortType", // portType����																														// Ϊ�ӿ�����
		    serviceName = "pIService", // ����name����
		    portName = "piPortName" // port����
)
public class PIServiceImpl implements PIService {

	@Override
	public String execute(String param) {

		return "ok";
	}

}
