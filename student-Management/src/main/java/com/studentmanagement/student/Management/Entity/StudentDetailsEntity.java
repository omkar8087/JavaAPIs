package com.studentmanagement.student.Management.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetailsEntity {
    private int stdId;
    private String stdName;
    private String stdCity;
    private String stdPinCode;
    private int stdPhoneNumber;
}
