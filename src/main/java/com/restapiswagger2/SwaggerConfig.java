package com.restapiswagger2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;




@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket developerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.spingbootswagger2"))
                .paths(regex("/developers.*"))
                .build()
                .apiInfo(metaData());
    }
    private ApiInfo metaData() {
        List<VendorExtension> ve=new ArrayList<>();
        ApiInfo apiInfo = new ApiInfo(
                "Spring Boot REST API",
                "Spring Boot REST API for Developers",
                "1.0",
                "Terms of service",
                new Contact("John Thomson", "https://springframework.guru/about/", "john@springfrmework.guru"),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0",ve);
        return apiInfo;
    }

}