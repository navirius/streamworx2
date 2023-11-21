package com.streamworx2.rest.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI apiDoc()
    {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Rest BE")
                        .version("1.0.0")
                        .license(new License()
                                .name("Test").url("https://www.google.com")));
    }
}
