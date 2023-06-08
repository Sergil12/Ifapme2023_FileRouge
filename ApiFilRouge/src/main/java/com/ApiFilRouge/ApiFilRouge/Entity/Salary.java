package com.ApiFilRouge.ApiFilRouge.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Salary {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "salary_id", updatable = false, nullable = false)

    UUID salary_id;
    Date create_date;
    String title;
    String comment;
    int amount;

    public Salary(Date create_date, String title, String comment, int amount) {
        this.create_date = create_date;
        this.title = title;
        this.comment = comment;
        this.amount = amount;
    }
}
