package com.studentmanagement.student.Management.controller;

import com.studentmanagement.student.Management.Entity.StudentDetailsEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<StudentDetailsEntity> studentDetail = new ArrayList<>();

    @GetMapping("/get")
    public List<StudentDetailsEntity> GetStudentInfo() {
        return studentDetail;
    }



    @GetMapping("/get/{Id}")
    public StudentDetailsEntity GetStudentInfo(@PathVariable int Id) {
        StudentDetailsEntity std =  studentDetail.get(Id);
        return std;
    }


    @PostMapping("add")
    public boolean addStudent(@RequestBody StudentDetailsEntity stdEntity) {
      return studentDetail.add(stdEntity);
    }


    @DeleteMapping("delete/{Id}")
    public StudentDetailsEntity deleteById(@PathVariable int Id){
        StudentDetailsEntity std = studentDetail.remove(Id);
        return  std;
    }

    @PutMapping("update/{Id}")
    public StudentDetailsEntity updateById(@PathVariable int Id,@RequestBody StudentDetailsEntity std){
          studentDetail.set(Id,std);
        return   studentDetail.get(Id);
    }

}
