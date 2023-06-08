package com.ApiFilRouge.ApiFilRouge.Entity;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "company_id", updatable = false, nullable = false)

    UUID company_id;
    String name;
    String description;
    String address;
    String is_managed;
    boolean active;
    boolean deleted;
    String deleted_by;
    @OneToMany
    // ca va créer une colonne contract_id_fk dans la table timesheet qui sera la clé etrangère du contract (contract_id)
    @JoinColumn(name = "company_id_fk", referencedColumnName = "company_id")
    List<Organization> organizationList;

    @ManyToMany
    @JoinTable(
            name = "company_contract",
            joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "contract_id"))
    List<Contract> contractList;

    public Company(String name, String description, String address, String is_managed, boolean active, boolean deleted, String deleted_by) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.is_managed = is_managed;
        this.active = active;
        this.deleted = deleted;
        this.deleted_by = deleted_by;
    }
}
