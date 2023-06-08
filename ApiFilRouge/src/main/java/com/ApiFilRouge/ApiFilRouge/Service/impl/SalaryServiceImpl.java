package com.ApiFilRouge.ApiFilRouge.Service.impl;
import com.ApiFilRouge.ApiFilRouge.Entity.Builder.SalaryBuilder;

import java.util.Date;
import com.ApiFilRouge.ApiFilRouge.Entity.Fleet;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SalaryPayload.SalaryCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SalaryPayload.SalaryUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Salary;
import com.ApiFilRouge.ApiFilRouge.Repository.FleetRepository;
import com.ApiFilRouge.ApiFilRouge.Repository.SalaryRepository;
import com.ApiFilRouge.ApiFilRouge.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Override
    public Salary create(SalaryCreatePayload salary) {
        Salary newSalary= new SalaryBuilder()
                .setCreate_date(new Date())
                .setTitle(salary.getTitle())
                .setComment(salary.getComment())
                .setAmount(salary.getAmount())
                .build();
        return this.salaryRepository.save(newSalary);
    }

    @Override
    public Salary update(SalaryUpdatePayload salary) {
        Salary detail = this.detail(salary.getSalary_id());
        if (detail != null) {
            detail.setTitle(salary.getTitle());
            detail.setComment(salary.getComment());
            detail.setAmount(salary.getAmount());
            return this.salaryRepository.save(detail);
        }
        return detail;
    }

    @Override
    public Salary detail(UUID salary_id) {
            return this.salaryRepository.findById(salary_id).orElse(null);
    }

    @Override
    public void delete(UUID salary_id) {
        Salary detail = this.detail(salary_id);
        if (detail != null) {
            this.salaryRepository.delete(detail);
        }

    }

    @Override
    public List<Salary> list() {
        return this.salaryRepository.findAll();
    }
    @Autowired
    SalaryRepository salaryRepository;
}
