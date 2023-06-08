package com.ApiFilRouge.ApiFilRouge.Entity.Payload.SalaryPayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryUpdatePayload {
    UUID salary_id;
    String title;
    String comment;
    int amount;
}
