package com.ApiFilRouge.ApiFilRouge.Repository;

import com.ApiFilRouge.ApiFilRouge.Entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SalaryRepository extends JpaRepository <Salary, UUID> {
}
