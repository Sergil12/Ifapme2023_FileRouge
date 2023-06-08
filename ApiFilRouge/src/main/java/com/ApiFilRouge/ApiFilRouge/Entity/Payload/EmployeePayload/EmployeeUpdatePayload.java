package com.ApiFilRouge.ApiFilRouge.Entity.Payload.EmployeePayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeUpdatePayload {
    UUID employee_id;
    String lastname;
    String firstname ;
    boolean active;
    String deleted_by;
    String address;
    String gender;
    Date birthday;
    int ssin;
    String status;
    boolean deleted;

    public boolean getActive() {
        return false;
    }

    public boolean getDelete() {
        return false;
    }
}
