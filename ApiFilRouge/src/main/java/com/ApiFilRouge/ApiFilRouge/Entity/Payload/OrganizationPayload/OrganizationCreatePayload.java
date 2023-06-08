package com.ApiFilRouge.ApiFilRouge.Entity.Payload.OrganizationPayload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationCreatePayload {
    String name;
    String description ;
}
