package com.ApiFilRouge.ApiFilRouge.Entity.Payload.CompanyPayload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyUpdatePayload {
    UUID company_id;
    String name;
    String description;
    String address;
    String is_managed;
    boolean active;
    boolean deleted;
    String deleted_by;

    public boolean getActive() {
        return false;
    }

    public boolean getDeleted() {
        return false;
    }
}
