package com.ApiFilRouge.ApiFilRouge.Service.impl;

import com.ApiFilRouge.ApiFilRouge.Entity.Builder.EmployeeBuilder;
import com.ApiFilRouge.ApiFilRouge.Entity.Employee;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.EmployeePayload.EmployeeCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.EmployeePayload.EmployeeUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Repository.DocumentRepository;
import com.ApiFilRouge.ApiFilRouge.Repository.EmployeeRepository;
import com.ApiFilRouge.ApiFilRouge.Service.EmployeeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Employee create(EmployeeCreatePayload employee) {
        Employee newEmployee= new EmployeeBuilder()
                .setLastname(employee.getLastname())
                .setFirstname(employee.getFirstname())
                .setActive(employee.getActive())
                .setDeleted_by(employee.getDeleted_by())
                .setAddress(employee.getAddress())
                .setGender(employee.getGender())
                .setBirthday((Data) employee.getBirthday())
                .setSsin(employee.getSsin())
                .setStatus(employee.getStatus())
                .setDeleted(employee.getDelete())
                .build();
        return this.employeeRepository.save(newEmployee);
    }

    @Override
    public Employee update(EmployeeUpdatePayload employee) {
        Employee detail = this.detail(employee.getEmployee_id());
        if (detail != null) {
            detail.setLastname(employee.getLastname());
            detail.setFirstname(employee.getFirstname());
            detail.setActive(employee.getActive());
            detail.setDeleted_by(employee.getDeleted_by());
            detail.setAddress(employee.getAddress());
            detail.setGender(employee.getGender());
            detail.setBirthday((Date) employee.getBirthday());
            detail.setSsin(employee.getSsin());
            detail.setStatus(employee.getStatus());
            detail.setDeleted(employee.getDelete());
            return this.employeeRepository.save(detail);
        }
        return detail;
    }

    @Override
    public Employee detail(UUID employee_id) {
        return this.employeeRepository.findById(employee_id).orElse(null);

    }

    @Override
    public void delete(UUID employee_id) {
        Employee detail = this.detail(employee_id);
        if (detail != null) {
            this.employeeRepository.delete(detail);
        }

    }

    @Override
    public List<Employee> list() {
        return this.employeeRepository.findAll();
    }
    @Autowired
    EmployeeRepository employeeRepository;

}
