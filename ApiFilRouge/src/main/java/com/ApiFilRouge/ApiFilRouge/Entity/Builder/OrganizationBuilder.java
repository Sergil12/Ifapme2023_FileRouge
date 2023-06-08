package com.ApiFilRouge.ApiFilRouge.Entity.Builder;

import com.ApiFilRouge.ApiFilRouge.Entity.Organization;

public class OrganizationBuilder implements Builder<Organization> {

    String name = "orgi";
    String description = "petite orgnaization";

    public OrganizationBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public OrganizationBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Organization build() {
        return new Organization(this.name, this.description);
    }
}
