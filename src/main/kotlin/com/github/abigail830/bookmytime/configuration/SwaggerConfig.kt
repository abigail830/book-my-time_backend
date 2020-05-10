package com.github.abigail830.bookmytime.configuration


import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
@Slf4j
class SwaggerConfig(@Value("\${swagger.enable}")val enableSwagger: Boolean) {

    @Bean
    open fun api() : Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.github.abigail830.bookmytime"))
                .paths(PathSelectors.any())
                .build()
                .enable(enableSwagger)
    }

    private fun apiInfo(): ApiInfo? {
        return ApiInfoBuilder()
                .title("Book-My-Time")
                .description("Calendar booking app")
                .version("0.0.1") // 版本号
                .build()
    }

}