package com.ApiFilRouge.ApiFilRouge.Entity.Builder;

import com.ApiFilRouge.ApiFilRouge.Entity.Employee;
import lombok.Data;

import java.util.Date;

public class EmployeeBuilder implements Builder<Employee>{
    String lastname="gilard";
    String firstname="serena";
    boolean active =true;
    String deleted_by="boss";
    String address="reue montagne de l'invasion";
    String gender="femme";
   Date birthday;
    int ssin = 4;
    String status="sous-boss";
    boolean deleted= false;

    public EmployeeBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public EmployeeBuilder setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public EmployeeBuilder setActive(boolean active) {
        this.active = active;
        return this;
    }

    public EmployeeBuilder setDeleted_by(String deleted_by) {
        this.deleted_by = deleted_by;
        return this;
    }

    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public EmployeeBuilder setBirthday(Data birthday) {
        this.birthday = (Date) birthday;
        return this;
    }

    public EmployeeBuilder setSsin(int ssin) {
        this.ssin = ssin;
        return this;
    }

    public EmployeeBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public EmployeeBuilder  setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    @Override
    public Employee build() {
        return null;
    }
}
