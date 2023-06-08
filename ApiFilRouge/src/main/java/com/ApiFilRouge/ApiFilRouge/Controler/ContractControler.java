package com.ApiFilRouge.ApiFilRouge.Controler;

import com.ApiFilRouge.ApiFilRouge.Entity.Contract;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.ContractPayload.ContractCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.ContractPayload.ContractUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Service.ContractService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public class ContractControler {
    ContractService contractService;

    @PostMapping("create")
    Contract create(@RequestBody() ContractCreatePayload contract) {
        return this.contractService.create(contract);
    }
    @PutMapping("update")
    Contract update(@RequestBody() ContractUpdatePayload contract) {
        return this.contractService.update(contract);
    }

    @GetMapping("detail/{id}")
    Contract detail(@PathVariable("id") UUID contract_id) {
        return this.contractService.detail(contract_id);
    }

    @DeleteMapping("delete/{id}")
    void delete(@PathVariable("id") UUID contract_id) {
        this.contractService.delete(contract_id);

    }

    @GetMapping("list")
    List<Contract> list() {
        return this.contractService.list();
    }
}
