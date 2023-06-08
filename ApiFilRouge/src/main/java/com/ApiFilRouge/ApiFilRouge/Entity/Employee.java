package com.ApiFilRouge.ApiFilRouge.Entity;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "employee_id", updatable = false, nullable = false)
    UUID employee_id;
    String lastname;
    String firstname;
    boolean active;
    String deleted_by;
    String address;
    String gender;
    Date birthday;
    int ssin;
    String status;
    boolean deleted;
    @OneToMany
    // ca va créer une colonne contract_id_fk dans la table timesheet qui sera la clé etrangère du contract (contract_id)
    @JoinColumn(name = "employee_id_fk", referencedColumnName = "employee_id")
    List<TimeSheet> timeSheetList;

    @OneToMany
    // ca va créer une colonne contract_id_fk dans la table timesheet qui sera la clé etrangère du contract (contract_id)
    @JoinColumn(name = "employee_id_fk", referencedColumnName = "employee_id")
    List<Salary> salaries;

    @ManyToOne
    Company company;

    @ManyToOne
    Contract contract;

    @ManyToOne
    Fleet fleet;

    @ManyToMany
    @JoinTable(
            name = "employee_skill",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    List<Skill> skillList;

    @ManyToOne
    Document document;


    public Employee(String lastname, String firstname, boolean active, String deleted_by, String address, String gender, Data birthday, int ssin, String status, boolean deleted) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.active = active;
        this.deleted_by = deleted_by;
        this.address = address;
        this.gender = gender;
        this.birthday = (Date) birthday;
        this.ssin = ssin;
        this.status = status;
        this.deleted = deleted;
    }
}
