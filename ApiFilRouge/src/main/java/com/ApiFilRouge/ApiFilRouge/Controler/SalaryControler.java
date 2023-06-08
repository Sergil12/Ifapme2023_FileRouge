package com.ApiFilRouge.ApiFilRouge.Controler;

import com.ApiFilRouge.ApiFilRouge.Entity.ApiResponse;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SalaryPayload.SalaryCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SalaryPayload.SalaryUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Salary;
import com.ApiFilRouge.ApiFilRouge.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@CrossOrigin(origins = "*", maxAge = 3600)
@EnableResourceServer
@RestController
@RequestMapping("/salary")
public class SalaryControler {
    @Autowired
    SalaryService salaryService;

    @PostMapping("create")
    ApiResponse create(@RequestBody SalaryCreatePayload salary) {


        return new ApiResponse(true,this.salaryService.create(salary),"");
    }
    @PutMapping("update")
    ApiResponse update(@RequestBody SalaryUpdatePayload salary) {
        return new ApiResponse(true, this.salaryService.update(salary),"");
    }

    @GetMapping("detail/{id}")
    ApiResponse detail(@PathVariable("id") UUID salary_id) {
        return new ApiResponse(true, this.salaryService.detail(salary_id),"");
    }

    @DeleteMapping("delete/{id}")
    void delete(@PathVariable("id") UUID salary_id) {
        this.salaryService.delete(salary_id);

    }

    @GetMapping("list")
    ApiResponse list() {
        return new ApiResponse(true,this.salaryService.list(),"");
    }
}
