package com.ApiFilRouge.ApiFilRouge.Repository;

import com.ApiFilRouge.ApiFilRouge.Entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DocumentRepository extends JpaRepository <Document, UUID> {
}
