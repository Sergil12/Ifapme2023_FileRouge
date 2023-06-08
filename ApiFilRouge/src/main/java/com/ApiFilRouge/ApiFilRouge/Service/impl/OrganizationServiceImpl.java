package com.ApiFilRouge.ApiFilRouge.Service.impl;
import com.ApiFilRouge.ApiFilRouge.Entity.Builder.OrganizationBuilder;

import com.ApiFilRouge.ApiFilRouge.Entity.Organization;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.OrganizationPayload.OrganizationCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.OrganizationPayload.OrganizationUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Repository.FleetRepository;
import com.ApiFilRouge.ApiFilRouge.Repository.OrganizationRepository;
import com.ApiFilRouge.ApiFilRouge.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Override
    public Organization create(OrganizationCreatePayload organization) {
        Organization newOrganization = new OrganizationBuilder()
                .setName(organization.getName())
                .setDescription(organization.getDescription())
                .build();
        return this.organizationRepository.save(newOrganization);
    }


    @Override
    public Organization update(OrganizationUpdatePayload organization) {
        Organization detail = this.detail(organization.getOrganization_id());
        if (detail != null) {
                    detail.setName(organization.getName());
                    detail.setDescription(organization.getDescription());
            return this.organizationRepository.save(detail);
        }
        return detail;
    }

    @Override
    public Organization detail(UUID organization_id) {
        return this.organizationRepository.findById(organization_id).orElse(null);
    }

    @Override
    public void delete(UUID organization_id) {
        Organization detail = this.detail(organization_id);
        if (detail != null) {
            this.organizationRepository.delete(detail);
        }
    }

    @Override
    public List<Organization> list() {
        return this.organizationRepository.findAll();
    }

    @Autowired
    OrganizationRepository organizationRepository;
}
