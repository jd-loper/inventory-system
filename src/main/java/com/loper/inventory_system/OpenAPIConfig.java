package com.loper.inventory_system;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Inventory Management API")
                        .description("An API to manage inventory items, including stock levels, prices, and product details.")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Joseph Loper")
                                .email("jd.loper@icloud.com")
                                .url("https://github.com/jd-loper")));
    }
}
