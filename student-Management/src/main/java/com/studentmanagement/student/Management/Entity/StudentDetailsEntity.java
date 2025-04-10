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
    private int stdPhoneNumber;
    private Address address;
}
