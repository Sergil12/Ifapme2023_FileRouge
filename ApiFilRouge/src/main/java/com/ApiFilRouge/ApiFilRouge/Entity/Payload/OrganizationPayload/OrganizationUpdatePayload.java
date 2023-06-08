package com.ApiFilRouge.ApiFilRouge.Entity.Payload.OrganizationPayload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationUpdatePayload {
    UUID organization_id;
    String name;
    String description ;
}
