package com.ApiFilRouge.ApiFilRouge.Controler;

import com.ApiFilRouge.ApiFilRouge.Entity.Employee;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.EmployeePayload.EmployeeCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.EmployeePayload.EmployeeUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public class EmployeeControler {

    EmployeeService employeeService;

    @PostMapping("create")
    Employee create(@RequestBody() EmployeeCreatePayload employee) {
        return this.employeeService.create(employee);
    }

    @PutMapping("update")
    Employee update(@RequestBody() EmployeeUpdatePayload employee) {
        return this.employeeService.update(employee);
    }

    @GetMapping("detail/{id}")
    Employee detail(@PathVariable("id") UUID employee_id) {
        return this.employeeService.detail(employee_id);
    }

    @DeleteMapping("delete/{id}")
    void delete(@PathVariable("id") UUID employee_id) {
        this.employeeService.delete(employee_id);

    }

    @GetMapping("list")
    List<Employee> list() {
        return this.employeeService.list();
    }
}
