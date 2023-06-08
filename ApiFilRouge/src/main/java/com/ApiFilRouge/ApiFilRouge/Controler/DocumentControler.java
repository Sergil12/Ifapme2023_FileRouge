package com.ApiFilRouge.ApiFilRouge.Controler;

import com.ApiFilRouge.ApiFilRouge.Entity.Document;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.DocumentPayload.DocumentCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.DocumentPayload.DocumentUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Service.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public class DocumentControler {

    DocumentService documentService;

    @PostMapping("create")
    Document create(@RequestBody() DocumentCreatePayload document) {
        return this.documentService.create(document);
    }
    @PutMapping("update")
    Document update(@RequestBody() DocumentUpdatePayload document) {
        return this.documentService.update(document);
    }

    @GetMapping("detail/{id}")
    Document detail(@PathVariable("id") UUID document_id) {
        return this.documentService.detail(document_id);
    }

    @DeleteMapping("delete/{id}")
    void delete(@PathVariable("id") UUID document_id) {
        this.documentService.delete(document_id);

    }

    @GetMapping("list")
    List<Document> list() {
        return this.documentService.list();
    }
}
