package com.ApiFilRouge.ApiFilRouge.Entity;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Document {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "document_id", updatable = false, nullable = false)

    UUID document_id;
    String title;
    String path;
    String content;
    String type;
    Date create_date;

    @ManyToOne
    Company company;

    @ManyToOne
    Contract contract;

    public Document(String title, String path, String content, String type, Data create_date) {
        this.title = title;
        this.path = path;
        this.content = content;
        this.type = type;
        this.create_date = (Date) create_date;
    }
}
