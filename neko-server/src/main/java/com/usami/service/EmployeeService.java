package com.usami.service;

import com.usami.dto.EmployeeLoginDTO;
import com.usami.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
