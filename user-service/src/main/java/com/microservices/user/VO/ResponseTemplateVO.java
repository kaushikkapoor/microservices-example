package com.microservices.user.VO;

import com.microservices.user.entity.Department;
import com.microservices.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    User user;
    Department department;
}
