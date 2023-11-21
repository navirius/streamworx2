package com.streamworx2;

import com.streamworx2.config.UrlFilterConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class Test2ApplicationApplication {
    public static void main(String[] args) {

        SpringApplication.run(Test2ApplicationApplication.class, args);
    }

//    @Bean
//    public FilterRegistrationBean tuckeyRegistrationBean() {
//        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(new UrlFilterConfig());
//        return registrationBean;
//    }
}
