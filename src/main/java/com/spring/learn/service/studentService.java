package com.spring.learn.service;

import com.spring.learn.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface studentService {

    // this method is to create all the student
    List<Student> getAllStudent();

    // this method is used to get a student by id
    Student getStudentByid(int id);
    // this method is used to create a new student
    void createStudent(Student student);

    // this method is used to delete a student by id
    List<Student> deleteStudent(int id);


}
