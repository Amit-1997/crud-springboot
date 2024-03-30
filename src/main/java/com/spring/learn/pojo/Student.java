package com.spring.learn.pojo;


import lombok.*;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Student {
    private int studentId;
    private String  name;
    private String college;
    private String dob;
}
