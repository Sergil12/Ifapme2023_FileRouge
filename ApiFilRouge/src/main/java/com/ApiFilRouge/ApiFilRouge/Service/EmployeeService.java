package com.ApiFilRouge.ApiFilRouge.Service;

import com.ApiFilRouge.ApiFilRouge.Entity.Employee;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.EmployeePayload.EmployeeCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.EmployeePayload.EmployeeUpdatePayload;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {
    Employee create(EmployeeCreatePayload employee);
    Employee  update(EmployeeUpdatePayload employee);
    Employee detail(UUID employee_id);
    void delete(UUID employee_id);
    List<Employee> list();

}
