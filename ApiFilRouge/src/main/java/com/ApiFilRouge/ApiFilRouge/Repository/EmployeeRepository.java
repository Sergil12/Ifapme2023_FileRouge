package com.ApiFilRouge.ApiFilRouge.Repository;

import com.ApiFilRouge.ApiFilRouge.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository <Employee, UUID> {
}
