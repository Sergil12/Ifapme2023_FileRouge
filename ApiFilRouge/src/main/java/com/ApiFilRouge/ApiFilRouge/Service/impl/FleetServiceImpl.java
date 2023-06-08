package com.ApiFilRouge.ApiFilRouge.Service.impl;

import com.ApiFilRouge.ApiFilRouge.Entity.Builder.FleetBuilder;
import com.ApiFilRouge.ApiFilRouge.Entity.Fleet;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.FleetPayload.FleetCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.FleetPayload.FleetUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Repository.FleetRepository;
import com.ApiFilRouge.ApiFilRouge.Service.FleetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FleetServiceImpl implements FleetService {
    @Override
    public Fleet create(FleetCreatePayload fleet) {
        Fleet newFleet= new FleetBuilder()
                .setTitle(fleet.getTitle())
                .setDescription((fleet.getDescription()))
                .setType(fleet.getType())
                .setCost(fleet.getCost())
                .build();
        return this.fleetRepository.save(newFleet);
    }


    @Override
    public Fleet update(FleetUpdatePayload fleet) {
        Fleet detail = this.detail(fleet.getFleet_id());
        if (detail != null) {
            detail.setTitle(fleet.getTitle());
            detail.setDescription((fleet.getDescription()));
            detail.setType(fleet.getType());
            detail.setCost(fleet.getCost());
            return this.fleetRepository.save(detail);
        }
        return detail;
    }

    @Override
    public Fleet detail(UUID fleet_id) {
        return this.fleetRepository.findById(fleet_id).orElse(null);
    }

    @Override
    public void delete(UUID fleet_id) {
        Fleet detail = this.detail(fleet_id);
        if (detail != null) {
            this.fleetRepository.delete(detail);
        }

    }

    @Override
    public List<Fleet> list() {
        return this.fleetRepository.findAll();
    }

    @Autowired
    FleetRepository fleetRepository;
}
