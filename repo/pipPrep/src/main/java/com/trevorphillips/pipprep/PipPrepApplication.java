package com.trevorphillips.pipprep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class PipPrepApplication {

    public static void main(String[] args) {
        SpringApplication.run(PipPrepApplication.class, args);

    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    private List<String> list = new ArrayList<>();




    private void doSomething(){
        getList();
    }

}
