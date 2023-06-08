package com.ApiFilRouge.ApiFilRouge.Service;

import com.ApiFilRouge.ApiFilRouge.Entity.Document;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.DocumentPayload.DocumentCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.DocumentPayload.DocumentUpdatePayload;

import java.util.List;
import java.util.UUID;

public interface DocumentService {
    Document create(DocumentCreatePayload document);
    Document  update(DocumentUpdatePayload document);
    Document  detail(UUID document_id);
    void delete(UUID document_id);
    List<Document> list();
}
