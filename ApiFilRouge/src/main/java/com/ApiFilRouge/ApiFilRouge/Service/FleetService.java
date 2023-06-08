package com.ApiFilRouge.ApiFilRouge.Service;

import com.ApiFilRouge.ApiFilRouge.Entity.Fleet;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.FleetPayload.FleetCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.FleetPayload.FleetUpdatePayload;

import java.util.List;
import java.util.UUID;

public interface FleetService {
    Fleet create(FleetCreatePayload fleet);
    Fleet  update(FleetUpdatePayload fleet);
    Fleet  detail(UUID fleet_id);
    void delete(UUID fleet_id);
    List<Fleet> list();
}
