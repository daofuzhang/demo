package com.demo.ws.client;

import java.net.MalformedURLException;

import com.demo.ws.client.DTZRFCHR049REQ.IOTPA0002;
import com.demo.ws.client.DTZRFCHR049REQ.IOTPA0021;

public class TestWs {

	public static void main(String[] args) throws MalformedURLException {
		SIOZRFCHR049 ws =  new SIOZRFCHR049Service().getHTTP_Port();
		DTZRFCHR049REQ req = new DTZRFCHR049REQ();
		
		IOTPA0002  ito002 =new IOTPA0002();
		ito002.setPERNR("00220447");
		req.getIOTPA0002().add(ito002);
		
		
		IOTPA0021 ito021 =new IOTPA0021();
		ito021.setPERNR("00220439");
		ito021.setZZPERNR("00767832");
		req.getIOTPA0021().add(ito021);
		
		ws.siOZRFCHR049(req);
	}

}
