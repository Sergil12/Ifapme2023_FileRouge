package com.ApiFilRouge.ApiFilRouge.Entity.Payload.FleetPayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FleetUpdatePayload {

    UUID fleet_id;
    String title;
    String description;
    String type;
    int cost;
}
