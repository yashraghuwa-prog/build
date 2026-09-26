package com.example.yash;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("compiling with 404 bugs but faster"
        );
    }
}
