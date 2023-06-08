package com.ApiFilRouge.ApiFilRouge.Service.impl;

import com.ApiFilRouge.ApiFilRouge.Entity.Builder.CompanyBuilder;
import com.ApiFilRouge.ApiFilRouge.Entity.Company;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.CompanyPayload.CompanyCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.CompanyPayload.CompanyUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Repository.CompanyRepository;
import com.ApiFilRouge.ApiFilRouge.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Override
    public Company create(CompanyCreatePayload company) {
        Company newCompany= new CompanyBuilder()
                .setName(company.getName())
                .setDescription(company.getDescription())
                .setAddress(company.getAddress())
                .setActive(company.getActive())
                .setIs_managed(company.getIs_managed())
                .setDeleted(company.getDeleted())
                .setDeleted_by(company.getDeleted_by())
                .build();
        return this.companyRepository.save(newCompany);

    }

    @Override
    public Company update(CompanyUpdatePayload company) {
        Company detail = this.detail(company.getCompany_id());
        if (detail != null) {
            detail.setName(company.getName());
            detail.setDescription(company.getDescription());
            detail.setAddress(company.getAddress());
            detail.setActive(company.getActive());
            detail.setIs_managed(company.getIs_managed());
            detail.setDeleted(company.getDeleted());
            detail.setDeleted_by(company.getDeleted_by());
            return this.companyRepository.save(detail);
        }
        return detail;
    }

    @Override
    public Company detail(UUID company_id) {
        return this.companyRepository.findById(company_id).orElse(null);
    }

    @Override
    public void delete(UUID company_id) {
        Company detail = this.detail(company_id);
        if (detail != null) {
            this.companyRepository.delete(detail);
        }

    }

    @Override
    public List<Company> list() {
        return this.companyRepository.findAll();
    }

    @Autowired
    CompanyRepository companyRepository;
}
