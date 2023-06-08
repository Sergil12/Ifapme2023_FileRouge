package com.ApiFilRouge.ApiFilRouge.Controler;

import com.ApiFilRouge.ApiFilRouge.Entity.Company;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.CompanyPayload.CompanyCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.CompanyPayload.CompanyUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public class CompanyControler {
    CompanyService companyService;

    @PostMapping("create")
    Company create(@RequestBody() CompanyCreatePayload company) {
        return this.companyService.create(company);
    }
    @PutMapping("update")
    Company update(@RequestBody() CompanyUpdatePayload company) {return this.companyService.update(company);
    }

    @GetMapping("detail/{id}")
    Company detail(@PathVariable("id") UUID company_id) {
        return this.companyService.detail(company_id);
    }

    @DeleteMapping("delete/{id}")
    void delete(@PathVariable("id") UUID company_id) {
        this.companyService.delete(company_id);

    }

    @GetMapping("list")
    List<Company> list() {
        return this.companyService.list();
    }
}
