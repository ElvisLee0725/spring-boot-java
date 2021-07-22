package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    // This is an example of using @Query. In normal cases, please use findByXXX methods
    @Query(value = "SELECT id, name FROM student WHERE id = ?1 AND name = ?2", nativeQuery = true)
    public Student getIdName(Integer id, String name);

    // Define customize JPA query
    public List<Student> findByName(String name);
    public Student findByIdAndName(Integer id, String name);
}
