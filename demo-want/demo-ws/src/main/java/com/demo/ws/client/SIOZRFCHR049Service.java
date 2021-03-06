package com.demo.ws.client;

import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;

import javax.xml.ws.WebServiceException;

import org.apache.logging.log4j.util.PropertiesUtil;

/**
 * Service implementation of {SI_O_ZRFCHR049Service} (generated by SAP WSDL to Java generator).
 */
@javax.xml.ws.WebServiceClient(name = "SI_O_ZRFCHR049Service", targetNamespace = "http://pi.want-want.com/ZRFCHR049", wsdlLocation = "http://epdev.want-want.com:50000/dir/wsdl?p=sa/b09f80c9bdd4301d8c6e2296375894f9")
public class SIOZRFCHR049Service extends javax.xml.ws.Service {
	
  private final static URL SIOZRFCHR049SERVICE_WSDL_LOCATION;
  private final static WebServiceException SIOZRFCHR049SERVICE_EXCEPTION;
  
  static {
      URL url = null;
      WebServiceException e = null;
      try {
          url = new URL("http://epdev.want-want.com:50000/dir/wsdl?p=sa/b09f80c9bdd4301d8c6e2296375894f9");
          Authenticator.setDefault(new Authenticator(){
                protected PasswordAuthentication getPasswordAuthentication() {
                      return new PasswordAuthentication("123456",
                                  "123456".toCharArray());
                }
          });
      } catch (MalformedURLException ex) {
          e = new WebServiceException(ex);
      }
      SIOZRFCHR049SERVICE_WSDL_LOCATION = url;
      SIOZRFCHR049SERVICE_EXCEPTION = e;
  }
  
  
  /**
   * Default service constructor.
   */
  public SIOZRFCHR049Service() throws java.net.MalformedURLException {
    super(SIOZRFCHR049SERVICE_WSDL_LOCATION, new javax.xml.namespace.QName("http://pi.want-want.com/ZRFCHR049", "SI_O_ZRFCHR049Service"));
  }
  public SIOZRFCHR049Service(java.net.URL wsdlLocation, javax.xml.namespace.QName serviceName) {
    super(wsdlLocation, serviceName);
  }
  /**
   * Get method for webservice port [HTTP_Port].
   */
  @javax.xml.ws.WebEndpoint(name = "HTTP_Port")
  public com.demo.ws.client.SIOZRFCHR049 getHTTP_Port() {
    javax.xml.namespace.QName portName = new javax.xml.namespace.QName("http://pi.want-want.com/ZRFCHR049","HTTP_Port");
    return (com.demo.ws.client.SIOZRFCHR049) super.getPort(portName,com.demo.ws.client.SIOZRFCHR049.class);
  }
  /**
   * Get method for webservice port [HTTPS_Port].
   */
  @javax.xml.ws.WebEndpoint(name = "HTTPS_Port")
  public com.demo.ws.client.SIOZRFCHR049 getHTTPS_Port() {
    javax.xml.namespace.QName portName = new javax.xml.namespace.QName("http://pi.want-want.com/ZRFCHR049","HTTPS_Port");
    return (com.demo.ws.client.SIOZRFCHR049) super.getPort(portName,com.demo.ws.client.SIOZRFCHR049.class);
  }
  
  private static URL __getWsdlLocation() {
      if (SIOZRFCHR049SERVICE_EXCEPTION!= null) {
          throw SIOZRFCHR049SERVICE_EXCEPTION;
      }
      return SIOZRFCHR049SERVICE_WSDL_LOCATION;
  }
  
}
