package com.ApiFilRouge.ApiFilRouge.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Fleet {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "fleet_id", updatable = false, nullable = false)

    UUID fleet_id;
    String title;
    String description;
    String type;
    int cost;

    public Fleet(String title, String description, String type, int cost) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.cost = cost;
    }
}
