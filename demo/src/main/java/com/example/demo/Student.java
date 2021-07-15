package com.example.demo;

import javax.validation.constraints.NotNull;
import java.util.List;

public class Student {
    @NotNull
    Integer id;
    
    String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
