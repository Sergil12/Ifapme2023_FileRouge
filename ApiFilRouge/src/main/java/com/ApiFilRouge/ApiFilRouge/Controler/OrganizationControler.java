package com.ApiFilRouge.ApiFilRouge.Controler;

import com.ApiFilRouge.ApiFilRouge.Entity.Organization;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.OrganizationPayload.OrganizationCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.OrganizationPayload.OrganizationUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Service.OrganizationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public class OrganizationControler {
    OrganizationService organizationService;

    @PostMapping("create")
    Organization create(@RequestBody() OrganizationCreatePayload organizationService) {
        return this.organizationService.create(organizationService);
    }
    @PutMapping("update")
    Organization update(@RequestBody() OrganizationUpdatePayload organizationService) {
        return this.organizationService.update(organizationService);
    }

    @GetMapping("detail/{id}")
    Organization detail(@PathVariable("id") UUID organizationService_id) {
        return this.organizationService.detail(organizationService_id);
    }

    @DeleteMapping("delete/{id}")
    void delete(@PathVariable("id") UUID organizationService_id) {
        this.organizationService.delete(organizationService_id);

    }

    @GetMapping("list")
    List<Organization> list() {
        return this.organizationService.list();
    }
}
