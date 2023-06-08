package com.ApiFilRouge.ApiFilRouge.Service.impl;
import com.ApiFilRouge.ApiFilRouge.Entity.Builder.ContractBuilder;

import com.ApiFilRouge.ApiFilRouge.Entity.Contract;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.ContractPayload.ContractCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.ContractPayload.ContractUpdatePayload;

import com.ApiFilRouge.ApiFilRouge.Repository.CompanyRepository;
import com.ApiFilRouge.ApiFilRouge.Repository.ContractRepository;
import com.ApiFilRouge.ApiFilRouge.Service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ContractServiceImpl implements ContractService {
    @Override
    public Contract create(ContractCreatePayload contract) {
        Contract newContract= new ContractBuilder()
                .setTitle(contract.getTitle())
                .setDescription(contract.getDescription())
                .setStart_date(contract.getStart_date())
                .setEnd_date(contract.getEnd_date())
                .setNb_hours_by_week(contract.getNb_hours_by_week())
                .build();
        return this.contractRepository.save(newContract);
    }

    @Override
    public Contract update(ContractUpdatePayload contract) {
        Contract detail = this.detail(contract.getContract_id());
        if (detail != null) {
            detail.setTitle(contract.getTitle());
            detail.setDescription(contract.getDescription());
            detail.setStart_date(contract.getStart_date());
            detail.setEnd_date(contract.getEnd_date());
            detail.setNb_hours_by_week(contract.getNb_hours_by_week());
            return this.contractRepository.save(detail);
        }
        return detail;
    }

    @Override
    public Contract detail(UUID contract_id) {
        return this.contractRepository.findById(contract_id).orElse(null);
    }

    @Override
    public void delete(UUID contract_id) {
        Contract detail = this.detail(contract_id);
        if (detail != null) {
            this.contractRepository.delete(detail);
        }

    }

    @Override
    public List<Contract> list() {
        return this.contractRepository.findAll();
    }

    @Autowired
    ContractRepository contractRepository;
}
