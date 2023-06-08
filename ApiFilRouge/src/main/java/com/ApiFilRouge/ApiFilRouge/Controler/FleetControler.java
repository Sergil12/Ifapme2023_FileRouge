package com.ApiFilRouge.ApiFilRouge.Controler;

import com.ApiFilRouge.ApiFilRouge.Entity.Fleet;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.FleetPayload.FleetCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.FleetPayload.FleetUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Service.FleetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public class FleetControler {

    FleetService fleetService;

    @PostMapping("create")
    Fleet create(@RequestBody() FleetCreatePayload fleet) {
        return this.fleetService.create(fleet);
    }

    @PutMapping("update")
    Fleet update(@RequestBody() FleetUpdatePayload fleet) {
        return this.fleetService.update(fleet);
    }

    @GetMapping("detail/{id}")
    Fleet detail(@PathVariable("id") UUID fleet_id) {
        return this.fleetService.detail(fleet_id);
    }

    @DeleteMapping("delete/{id}")
    void delete(@PathVariable("id") UUID fleet_id) {
        this.fleetService.delete(fleet_id);

    }

    @GetMapping("list")
    List<Fleet> list() {
        return this.fleetService.list();
    }
}
