package com.spring.learn.serviceImpl;


import com.spring.learn.Exception.DuplicateValueFoundException;
import com.spring.learn.Exception.ResourceNotFoundException;
import com.spring.learn.pojo.Student;
import com.spring.learn.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class studentServiceImpl implements studentService {


    @Autowired
    private Student student;
    static  List<Student> al;


    public studentServiceImpl() {
        al=new ArrayList<>();
        al.add(new Student(1,"AMIT","VIT", "19/12/1997"));
        al.add(new Student(2,"ANKIT","MIT", "16/12/1997"));
        al.add(new Student(3,"RAMESH","IIT", "9/12/1994"));
        al.add(new Student(4,"AKASH","NIT", "4/12/1998"));
    }

    @Override
    public List<Student> getAllStudent() {
        return al;
    }

    @Override
    public Student getStudentByid(int id) {
        Student s= al.stream().filter(e->{
            if(e.getStudentId()==id)
                return true;return false;

        }).findFirst().orElseThrow(()->new ResourceNotFoundException("Student not found with id : "+id));
        return s;
    }

    @Override
    public void createStudent(Student student) {

        Optional<Student> student1=al.stream().filter(e->
        {
            if(e.getStudentId()==student.getStudentId())
                return true;
            return false;
        }).findFirst();

        if(student1.isEmpty())
                al.add(new Student(student.getStudentId(), student.getName(), student.getCollege(), student.getDob()));

            else
                throw new DuplicateValueFoundException("id is already present");
        }



    @Override
    public List<Student> deleteStudent(int id) {

      List<Student> students= al.stream().filter(e->
        {
            if(e.getStudentId()!=id)
                return true;return false;
        }).collect(Collectors.toList());
      return students;

    }
}
