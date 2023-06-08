package com.ApiFilRouge.ApiFilRouge.Entity.Builder;

import com.ApiFilRouge.ApiFilRouge.Entity.Salary;
import lombok.Data;

import java.util.Date;

public class SalaryBuilder implements Builder<Salary>{

    Date create_date;
    String title;
    String comment;
    int amount;

    public SalaryBuilder setCreate_date(Date create_date) {
        this.create_date =  create_date;
        return this;
    }

    public SalaryBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public SalaryBuilder setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public SalaryBuilder setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public Salary build() {
        return new Salary( this.create_date,this.title,this.comment, this.amount);
    }
}
