package com.ApiFilRouge.ApiFilRouge.Service;

import com.ApiFilRouge.ApiFilRouge.Entity.Company;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.CompanyPayload.CompanyCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.CompanyPayload.CompanyUpdatePayload;

import java.util.List;
import java.util.UUID;

public interface CompanyService {
    Company create (CompanyCreatePayload Company);
    Company  update (CompanyUpdatePayload Company);
    Company  detail (UUID company_id);
    void delete(UUID company_id);
    List<Company> list();

}


