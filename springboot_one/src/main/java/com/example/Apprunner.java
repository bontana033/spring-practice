package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Apprunner implements ApplicationRunner {

    @Autowired
    Holoman holoman;


    public void run(ApplicationArguments args) throws Exception {
        System.out.println(holoman);
    }
}
