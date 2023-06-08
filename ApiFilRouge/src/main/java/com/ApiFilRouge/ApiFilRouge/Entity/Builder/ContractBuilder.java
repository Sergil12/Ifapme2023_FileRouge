package com.ApiFilRouge.ApiFilRouge.Entity.Builder;

import com.ApiFilRouge.ApiFilRouge.Entity.Contract;
import lombok.Data;

import java.sql.Date;

public class ContractBuilder implements Builder<Contract>{
    String title ="contrat 1";
    String description;
    Date start_date;
    Date end_date;
    int nb_hours_by_week= 3;

    public ContractBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ContractBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public ContractBuilder setStart_date(Data start_date) {
        this.start_date = (Date) start_date;
        return this;
    }

    public ContractBuilder setEnd_date(Data end_date) {
        this.end_date = (Date) end_date;
        return this;
    }

    public ContractBuilder setNb_hours_by_week(int nb_hours_by_week) {
        this.nb_hours_by_week = nb_hours_by_week;
        return this;
    }
    @Override
    public Contract build() {
        // on utilisera toujours le constructeur full paramètres de l'entité souhaité.
        return new Contract(this.title, this.description, (Data) this.start_date, (Data) this.end_date,this.nb_hours_by_week);
    }
}
