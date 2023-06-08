package com.ApiFilRouge.ApiFilRouge.Repository;

import com.ApiFilRouge.ApiFilRouge.Entity.TimeSheet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TimeSheetRepository extends JpaRepository <TimeSheet, UUID>{
}
