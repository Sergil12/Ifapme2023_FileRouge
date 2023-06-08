package com.ApiFilRouge.ApiFilRouge.Entity.Payload.FleetPayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FleetCreatePayload {
    String title;
    String description;
    String type;
    int cost;
}
