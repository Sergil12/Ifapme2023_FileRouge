package com.ApiFilRouge.ApiFilRouge.Service.impl;

import com.ApiFilRouge.ApiFilRouge.Entity.Builder.DocumentBuilder;
import com.ApiFilRouge.ApiFilRouge.Entity.Document;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.DocumentPayload.DocumentCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.DocumentPayload.DocumentUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Repository.ContractRepository;
import com.ApiFilRouge.ApiFilRouge.Repository.DocumentRepository;
import com.ApiFilRouge.ApiFilRouge.Service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Override
    public Document create(DocumentCreatePayload document) {
        Document newDocument= new DocumentBuilder()
                .setTitle(document.getTitle())
                .setPath(document.getPath())
                .setContent(document.getContent())
                .setType(document.getType())
                .setCreate_date(document.getCreate_date())
                .build();
        return this.documentRepository.save(newDocument);
    }

    @Override
    public Document update(DocumentUpdatePayload document) {
        Document detail = this.detail(document.getDocument_id());
        if (detail != null) {
            detail.setTitle(document.getTitle());
            detail.setPath(document.getPath());
            detail.setContent(document.getContent());
            detail.setType(document.getType());
            detail.setCreate_date(document.getCreate_date());
            return this.documentRepository.save(detail);
        }
        return detail;
    }

    @Override
    public Document detail(UUID document_id) {
        return this.documentRepository.findById(document_id).orElse(null);
    }

    @Override
    public void delete(UUID document_id) {
        Document detail = this.detail(document_id);
        if (detail != null) {
            this.documentRepository.delete(detail);
        }

    }

    @Override
    public List<Document> list() {
        return this.documentRepository.findAll();
    }

    @Autowired
    DocumentRepository documentRepository;
}
