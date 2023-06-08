package com.ApiFilRouge.ApiFilRouge.Entity.Builder;

import com.ApiFilRouge.ApiFilRouge.Entity.Document;

import lombok.Data;

import java.sql.Date;

public class DocumentBuilder implements Builder<Document>{
    String title="le pays des reve";
    String path="lepays/desreve";
    String content="des reve";
    String type="png";
    Date create_date;

    public DocumentBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public DocumentBuilder setPath(String path) {
        this.path = path;
        return this;
    }

    public DocumentBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public  DocumentBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public DocumentBuilder setCreate_date(Data create_date) {
        this.create_date = (Date) create_date;
        return this;
    }
    @Override
    public Document build() {
        // on utilisera toujours le constructeur full paramètres de l'entité souhaité.
        return new Document(this.title, this.path, this.content, this.type, (Data) this.create_date);
    }
}
