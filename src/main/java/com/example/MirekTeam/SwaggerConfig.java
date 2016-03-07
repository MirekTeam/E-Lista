package com.example.MirekTeam;

/**
 * Created by Shardo on 07.03.2016.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().paths(apiPaths()).build();
    }
    private Predicate<String> apiPaths() {
        return or(regex("/elista/.*"));
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("E-Lista").description("Opis").termsOfServiceUrl("Terms of Service")
                .contact("Dane kontaktowe").license("Apache License Version 2.0")
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE").version("2.0").build();
    }
}

