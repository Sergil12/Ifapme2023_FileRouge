package com.ApiFilRouge.ApiFilRouge.Repository;

import com.ApiFilRouge.ApiFilRouge.Entity.Fleet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FleetRepository extends JpaRepository <Fleet, UUID> {
}
