package com.cosin.servicecomb.provider;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class ProviderServiceSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderServiceSpringBootApplication.class,args);
    }

}
