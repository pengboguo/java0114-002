package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 *
 * @Author Eddy
 */


@SpringBootApplication
@EnableCaching
public class SpringbootJpaThymeleafDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaThymeleafDemoApplication.class, args);
    }

}
