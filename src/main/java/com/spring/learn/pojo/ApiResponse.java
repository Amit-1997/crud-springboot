package com.spring.learn.pojo;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ApiResponse {

    private String message;
    private boolean  status;

}
