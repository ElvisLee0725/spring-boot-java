package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// @RequestMapping("/detail")
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
    @RequestMapping("/test1")
    public String test1(@RequestParam Integer id,
                        @RequestParam(defaultValue = "Amy") String name) {
        System.out.println("Id: " + id);
        System.out.println(("Name: " + name));
        return "test1 query parameter";
    }

    @RequestMapping("/test2")
    public String test2(@RequestBody Student student) {
        System.out.println("Id: " + student.getId());
        System.out.println(("Name: " + student .getName()));
        return "test2 request body";
    }

    @RequestMapping("/test3")
    public String test3(@RequestHeader(name = "Content-Type") String contentType) {
        System.out.println("Content-Type: " + contentType);
        return "test3 request header";
    }

    @RequestMapping("/test4/{id}/{name}")
    public String test4(@PathVariable Integer id,
                        @PathVariable String name) {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        return "test4 path variable";
    }

    @RequestMapping("/product")
    public Store product() {
        Store store = new Store();
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        store.setProductList(list);
        return store;
    }

    @RequestMapping("/user")
    public Student user() {
        Student s = new Student();
        s.setName("Elvis Lee");
        return s;
    }
}
