package com.ApiFilRouge.ApiFilRouge.Service;

import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SalaryPayload.SalaryCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SalaryPayload.SalaryUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Salary;

import java.util.List;
import java.util.UUID;

public interface SalaryService {
    Salary create(SalaryCreatePayload salary);
    Salary  update(SalaryUpdatePayload salary);
    Salary  detail(UUID salary_id);
    void delete(UUID salary_id);
    List<Salary> list();
}
