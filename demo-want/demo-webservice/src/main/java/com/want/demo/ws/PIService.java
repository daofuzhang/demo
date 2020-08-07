package com.want.demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://want-want.com/ws" )
public interface PIService {

	@WebMethod
    public String execute(@WebParam(name = "param") String param);
}
