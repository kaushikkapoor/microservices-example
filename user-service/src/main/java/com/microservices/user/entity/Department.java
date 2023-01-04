package com.microservices.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    Long departmentId;
    String departmentName;
    String departmentAddress;
    String departmentCode;
}
