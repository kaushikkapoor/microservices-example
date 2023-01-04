package com.microservices.user.service;

import com.microservices.user.VO.ResponseTemplateVO;
import com.microservices.user.entity.Department;
import com.microservices.user.entity.User;
import com.microservices.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser method of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO findByUserId(Long userId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        responseTemplateVO.setUser(user);
        Department dept = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
        responseTemplateVO.setDepartment(dept);
        return responseTemplateVO;
    }
}
