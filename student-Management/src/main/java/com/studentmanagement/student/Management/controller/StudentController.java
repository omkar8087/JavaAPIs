package com.studentmanagement.student.Management.controller;

import com.studentmanagement.student.Management.Entity.StudentDetailsEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<StudentDetailsEntity> studentDetail = new ArrayList<>();

    @GetMapping("/getStudentDetails")
    public List<StudentDetailsEntity> GetStudentInfo(){
        studentDetail.add(
        new StudentDetailsEntity(
                101,
                "abcd xyz",
                "mumbai",
                "400098",
                1234567891)
        );
        return studentDetail;
    }

}
