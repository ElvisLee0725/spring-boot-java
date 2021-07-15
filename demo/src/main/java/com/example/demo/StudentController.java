package com.example.demo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

// Implement Student API
@RestController
@Validated
public class StudentController {

    // Create student
    @PostMapping("/students")
    //@RequestMapping(value = "/students", method = RequestMethod.POST)
    public String create(@RequestBody @Valid Student student) {
        return "Execute create operation";
    }

    // Read student with id
    @GetMapping("/students/{studentId}")
    public String read(@PathVariable @Min(100) Integer studentId) {
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
