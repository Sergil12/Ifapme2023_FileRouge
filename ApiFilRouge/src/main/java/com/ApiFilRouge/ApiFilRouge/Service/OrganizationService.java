package com.ApiFilRouge.ApiFilRouge.Service;

import com.ApiFilRouge.ApiFilRouge.Entity.Organization;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.OrganizationPayload.OrganizationCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.OrganizationPayload.OrganizationUpdatePayload;

import java.util.List;
import java.util.UUID;

public interface OrganizationService {
    Organization create(OrganizationCreatePayload organization);
    Organization  update(OrganizationUpdatePayload organization);
    Organization  detail(UUID organization_id);
    void delete(UUID organization_id);
    List<Organization> list();
}
