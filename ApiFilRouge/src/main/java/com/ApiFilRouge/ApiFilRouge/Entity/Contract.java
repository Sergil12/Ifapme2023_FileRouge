package com.ApiFilRouge.ApiFilRouge.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Contract {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "contract_id", updatable = false, nullable = false)

    UUID contract_id;
    String title;
    String description;
    Date start_date;
    Date end_date;
    int nb_hours_by_week;

    @OneToMany
    // ca va créer une colonne contract_id_fk dans la table timesheet qui sera la clé etrangère du contract (contract_id)
    @JoinColumn(name = "contract_id_fk", referencedColumnName = "contract_id")
    List<TimeSheet> timeSheetList;

    public Contract(String title, String description, Data start_date, Data end_date, int nb_hours_by_week) {
        this.title = title;
        this.description = description;
        this.start_date = (Date) start_date;
        this.end_date = (Date) end_date;
        this.nb_hours_by_week = nb_hours_by_week;
    }
}
