package com.ApiFilRouge.ApiFilRouge.Service;

import com.ApiFilRouge.ApiFilRouge.Entity.Contract;

import com.ApiFilRouge.ApiFilRouge.Entity.Payload.ContractPayload.ContractCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.ContractPayload.ContractUpdatePayload;

import java.util.List;
import java.util.UUID;

public interface ContractService {
    Contract create (ContractCreatePayload Contract);
    Contract  update (ContractUpdatePayload Contract);
    Contract  detail (UUID contract_id);
    void delete(UUID contract_id);
    List<Contract> list();
}
