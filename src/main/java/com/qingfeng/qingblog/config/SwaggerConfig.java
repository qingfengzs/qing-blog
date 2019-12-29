package com.qingfeng.qingblog.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configurable
public class SwaggerConfig {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).
                apiInfo(apiInfo()).
                select().
                apis(RequestHandlerSelectors.basePackage("com.qingfeng.qingblog")).
                paths(PathSelectors.any()).
                build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().
                title("qing blog").
                description("这是我的blog").
                termsOfServiceUrl("http://www.baidu.com").
                contact("@jinyu_hello@163.com").
                version("1.0").
                build();
    }
}
