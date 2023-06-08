package com.ApiFilRouge.ApiFilRouge.Repository;

import com.ApiFilRouge.ApiFilRouge.Entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContractRepository extends JpaRepository <Contract, UUID> {
}
