package com.yunxiao.student_management_systempro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yunxiao.frame.mapper")
public class StudentManagementSystemproApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemproApplication.class, args);
    }

}
