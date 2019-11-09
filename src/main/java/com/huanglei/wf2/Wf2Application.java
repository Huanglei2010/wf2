package com.huanglei.wf2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Wf2Application {

    public static void main(String[] args) {
        SpringApplication.run(Wf2Application.class, args);
    }
}
