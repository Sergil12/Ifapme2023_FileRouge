package com.ApiFilRouge.ApiFilRouge.Entity.Builder;

import com.ApiFilRouge.ApiFilRouge.Entity.Company;

public class CompanyBuilder implements Builder<Company>{
    String name="gilard";
    String description="serena est belle";
    String address="rue hovemont";
    String is_managed="sncb";
    boolean active= true;
    boolean deleted= false;
    String deleted_by="boss";

    public CompanyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CompanyBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public CompanyBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public CompanyBuilder setIs_managed(String is_managed) {
        this.is_managed = is_managed;
        return this;
    }

    public CompanyBuilder setActive(boolean active) {
        this.active = active;
        return this;
    }

    public CompanyBuilder setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public CompanyBuilder setDeleted_by(String deleted_by) {
        this.deleted_by = deleted_by;
        return this;
    }

    @Override
    public Company build() {
        // on utilisera toujours le constructeur full paramètres de l'entité souhaité.
        return new Company(this.name, this.description, this.address, this.is_managed, this.active, this.deleted, this.deleted_by);
    }
}
