package com.want.demo.config;

import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.want.demo.ws.PIService;
import com.want.demo.ws.PIServiceImpl;

@Configuration
public class WebServiceConfig {

	/**
    *
    * */
   @Bean("cxfServletRegistration")
   public ServletRegistrationBean<CXFServlet> dispatcherServlet(){
       return new ServletRegistrationBean<CXFServlet>(new CXFServlet(),"/ws/*");
   }
   /**
    * ����ҵ������ ��ȻҲ����ֱ�� ��ʵ�����ϱ�ע @Service
    */
   @Bean
   public PIService pIService() {
       return new PIServiceImpl();
   }

   /*
    * �Ǳ�Ҫ��
    */
   @Bean(name = Bus.DEFAULT_BUS_ID)
   public SpringBus springBus() {
       SpringBus springBus = new SpringBus();
       return springBus;
   }

   /*
    * ����endpoint
    *  http://localhost:8080/ws/pi?wsdl 
    */
   @Bean
   public Endpoint endpoint( ) {
       EndpointImpl endpoint = new EndpointImpl(springBus(), pIService());
       endpoint.publish("/pi");//������ַ
       return endpoint;
   }
}
