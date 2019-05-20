package com.noobie.dongle.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.noobie.dongle"})
@MapperScan(basePackages = "com.noobie.dongle.*.mapper")
public class DongleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DongleApplication.class, args);
    }

}
