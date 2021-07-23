package com.example.demo.controller;

import com.example.demo.Student;
import com.example.demo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Implement Student API
@RestController
@Validated
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/students")
    public String insert(@RequestBody Student student) {
        studentRepository.save(student);
        return "Execute CREATE operation";
    }

    @GetMapping("/students/{id}/{name}")
    public Student getStudentWithIdName(@PathVariable Integer id,
                                        @PathVariable String name) {
        return studentRepository.getIdName(id, name);
    }

    @GetMapping("/students")
    public List<Student> getStudentByName(@RequestParam String name) {
        return studentRepository.findByName(name);
    }

    @GetMapping("/students2/{id}/{name}")
    public Student getStudentWithIdName2(@PathVariable Integer id,
                                        @PathVariable String name) {
        return studentRepository.findByIdAndName(id, name);
    }

//    @Autowired
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//    // Create student
//    @PostMapping("/students")
//    public String insert(@RequestBody Student student) {
//        String sql = "INSERT INTO student(name) VALUE (:studentName)";
//        Map<String, Object> map = new HashMap<>();
//        map.put("studentName", student.getName());
//
//        // Get the auto-generated key from db with KeyHolder
//        KeyHolder keyholder = new GeneratedKeyHolder();
//
//        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyholder);
//
//        int id = keyholder.getKey().intValue();
//        System.out.println("MySQL auto generated id: " + id);
//        return "Execute INSERT sql";
//    }
//
//    @PostMapping("/students/batch")
//    public String batchInsert(@RequestBody List<Student> studentList) {
//        String sql = "INSERT INTO student(name) VALUE (:studentName)";
//
//        MapSqlParameterSource [] parameterSources = new MapSqlParameterSource[studentList.size()];
//        for(int i = 0; i < studentList.size(); i++) {
//            Student student = studentList.get(i);
//
//            parameterSources[i] = new MapSqlParameterSource();
//            parameterSources[i].addValue("studentName", student.getName());
//        }
//
//        namedParameterJdbcTemplate.batchUpdate(sql, parameterSources);
//        return "Execute batch insert SQL";
//    }
//
//    @GetMapping("/students")
//    public List<Student> select() {
//        String sql = "SELECT id, name FROM student";
//        Map<String, Object> map = new HashMap<>();
//
//        List<Student> list = namedParameterJdbcTemplate.query(sql, map, new StudentRowMapper());
//        return list;
//    }
//
//    @GetMapping("/students/{studentId}")
//    public Student selectById(@PathVariable Integer studentId) {
//
//    }
//
//    @DeleteMapping("/students/{studentId}")
//    public String delete(@PathVariable Integer studentId) {
//        String sql = "DELETE FROM student WHERE id = :studentId";
//        Map<String, Object> map = new HashMap<>();
//        map.put("studentId", studentId);
//        namedParameterJdbcTemplate.update(sql, map);
//        return "Execute DELETE sql";
//    }
//
//    // Update student with id
//    @PutMapping("/students/{studentId}")
//    public String update(@PathVariable Integer studentId,
//                         @RequestBody Student student) {
//        return "Execute update operation";
//    }
}
