package com.example.SpringAOP.service;

import org.springframework.stereotype.Service;

@Service
public class PrintSomething {

    @TimeMonitor
    public String printSomething(){
        for(int i =0 ; i < 100; i++){};
        return "hello";
    }


}
