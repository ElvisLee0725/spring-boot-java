package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/detail")
@RestController
public class MyController {

//    @Autowired
//    private Printer printer;
//
//    @RequestMapping("/test")
//    public String test() {
//        printer.print("Hello Big World");
//        return "Hello World";
//    }

    @RequestMapping("/product")
    public String product() {
        System.out.printf("Call product path");
        return "First is apple, second is orange";
    }

    @RequestMapping("/user")
    public String user() {
        System.out.println("Call user path");
        return "Elvis Lee";
    }
}
