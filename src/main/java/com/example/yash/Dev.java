package com.example.yash;

import org.springframework.stereotype.Component;

@Component
public class Dev {
      Laptop laptop;
      public void build(){

         laptop.compile();

          System.out.println("working on awesome Project");
      }
}
