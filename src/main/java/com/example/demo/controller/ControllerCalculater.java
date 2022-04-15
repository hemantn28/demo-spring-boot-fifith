package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCalculater {

    //ENDPOINT

    @RequestMapping("/division")
    public int divide(){
        int a=50;
        int b=5;
        int c=a/b;
        return c;
    }

    @RequestMapping("/divide")
    public String divide2(){
        int a=81;
        int b=9;
        int c=a/b;
        return "division is: "+c;
    }
    @RequestMapping("/multiply")
    public int multiply(){
        int a=90;
        int b=3;
        int c=a*b;
        return c;
    }

    @RequestMapping("/multiplication")
    public String multiply2(){
        int a=8;
        int b=4;
        int c=a*b;
        return "multiplication is: "+c;
    }

    @RequestMapping("/sum")
    public int addition(){
        int a=5;
        int b=6;
        int c=a+b;
        return c;
    }

    @RequestMapping("/addition")
    public String sum(){
        int a=9;
        int b=8;
        int c=a+b;
        return "Addition is: "+c;
    }


    @RequestMapping("/subtraction")
    public int minus(){
        int a=87;
        int b=45;
        int c=a-b;
        return c;

    }

    @RequestMapping("/minus")
    public String subtraction(){
        int a=789;
        int b=786;
        int c=a-b;
        return "subtraction is: "+c;
    }
}
