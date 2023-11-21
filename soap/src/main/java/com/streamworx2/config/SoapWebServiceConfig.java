package com.streamworx2.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

@Configuration
@EnableWs
public class SoapWebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/external/services/ws/sample-service/*");
    }

    @Bean(name = "sample")
    public DefaultWsdl11Definition calculatorServiceDefinition(XsdSchemaCollection schemaCollection) {
        DefaultWsdl11Definition wsdlDefinition = new DefaultWsdl11Definition();
        wsdlDefinition.setPortTypeName("SampleServicePort");
        wsdlDefinition.setLocationUri("/external/services/ws/sample-service");
        wsdlDefinition.setTargetNamespace("http://sample-service.com/");
        wsdlDefinition.setSchemaCollection(schemaCollection);
        return wsdlDefinition;
    }
    @Bean
    public XsdSchemaCollection getRequestSchema() {
        CommonsXsdSchemaCollection coll = new CommonsXsdSchemaCollection(
                new ClassPathResource("wsdl/request.xsd"),
                new ClassPathResource("wsdl/response.xsd")
        );
        coll.setInline(true);
        return coll;
    }

}
