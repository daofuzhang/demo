package com.demo.ws.client;

/**
 * Service Endpoint Interface (generated by SAP WSDL to Java generator).
 */
@javax.jws.WebService(name = "SI_O_ZRFCHR049", targetNamespace = "http://pi.want-want.com/ZRFCHR049")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE, style = javax.jws.soap.SOAPBinding.Style.DOCUMENT, use = javax.jws.soap.SOAPBinding.Use.LITERAL)
public interface SIOZRFCHR049 {

  /**
   * Java representation of web method [SI_O_ZRFCHR049].
   */
  @javax.jws.WebMethod(operationName = "SI_O_ZRFCHR049", action = "http://sap.com/xi/WebService/soap1.1")
  @javax.jws.WebResult(name = "MT_ZRFCHR049_RES", targetNamespace = "http://pi.want-want.com/ZRFCHR049", partName = "MT_ZRFCHR049_RES")
  public com.demo.ws.client.DTZRFCHR049RES siOZRFCHR049(@javax.jws.WebParam(name = "MT_ZRFCHR049_REQ", targetNamespace = "http://pi.want-want.com/ZRFCHR049", partName = "MT_ZRFCHR049_REQ") com.demo.ws.client.DTZRFCHR049REQ MT_ZRFCHR049_REQ);

}