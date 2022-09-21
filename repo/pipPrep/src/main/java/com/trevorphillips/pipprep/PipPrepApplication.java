package com.trevorphillips.pipprep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PipPrepApplication {

    public static void main(String[] args) {
        SpringApplication.run(PipPrepApplication.class, args);

        System.out.println("GMT");
    }

}
