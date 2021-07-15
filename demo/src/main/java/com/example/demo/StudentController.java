package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

// Implement Student API
@RestController
public class StudentController {

    // Create student
    @PostMapping("/students")
    //@RequestMapping(value = "/students", method = RequestMethod.POST)
    public String create(@RequestBody @Valid Student student) {
        return "Execute create operation";
    }

    // Read student with id
    @GetMapping("/students/{studentId}")
    public String read(@PathVariable Integer studentId) {
        return "Execute read operation";
    }

    // Update student with id
    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student) {
        return "Execute update operation";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId) {
        return "Execute delete operation";
    }
}
