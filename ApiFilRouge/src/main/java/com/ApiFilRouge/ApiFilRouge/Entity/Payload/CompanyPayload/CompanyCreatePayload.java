package com.ApiFilRouge.ApiFilRouge.Entity.Payload.CompanyPayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyCreatePayload {

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
