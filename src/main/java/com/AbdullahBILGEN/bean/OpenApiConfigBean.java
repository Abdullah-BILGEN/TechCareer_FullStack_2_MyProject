package com.AbdullahBILGEN.bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Configuration;

// ********************* METHODLARIN SONUNA HOCA BİLEREK METHOD YAZIYOR NORMAL KENDİ YAZDIĞI ANLAŞILSIN DİYE NORMALDE SİLİNMELİ *************

@Configuration
public class OpenApiConfigBean {
    public OpenAPI openAPIMethod(){
        return new OpenAPI()
                .info(
                        new Info().description("blog tanımlama")
                                .version("V1")
                                .contact(new Contact().email("abdullah.abl52@gmail.com").url("Url"))
                                .title("title")
                             //   .license("gttp://wwww.google.com")
                                .termsOfService("Software INC")
                                .license(new License().url("gttp://wwww.google.com").name("Name")));

    }
}
