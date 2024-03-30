package com.spring.learn.studentMapping;


import com.spring.learn.pojo.Student;
import com.spring.learn.serviceImpl.studentServiceImpl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Mapping {

    @Autowired
    private Student student;
    @Autowired
    private studentServiceImpl studentService;

    @GetMapping("/getAll")
    public List<Student> getAllStudents()
    {
       return studentService.getAllStudent();
    }

    @GetMapping("{id}")
    public Student getStudentsById(@PathVariable int id)
    {
        return studentService.getStudentByid(id);
    }

    @DeleteMapping("{id}")
    public List<Student> deleteStudentsById(@PathVariable int id)
    {
        return studentService.deleteStudent(id);
    }

    @PostMapping()
    public String deleteStudentsById(@RequestBody Student student)
    {
       studentService.createStudent(student);
       return "student added";
    }

}
