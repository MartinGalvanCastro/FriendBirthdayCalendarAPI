package com.khaez.friendbirthdatecalendar.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    /**
     * Method that returns a custom Swagger Config
     *
     * @return Swagger Config
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("friend-birthday-calendar-api")
                                .version("1.0")
                                .description("REST API for Friend Birthday Calendar App")
                                .contact(
                                        new Contact()
                                                .name("Khaez")
                                                .url("https://github.com/MartinGalvanCastro")));
    }
}
