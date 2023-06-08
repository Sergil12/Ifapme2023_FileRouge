package com.ApiFilRouge.ApiFilRouge.Entity.Payload.SalaryPayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SalaryCreatePayload {
    String title;
    String comment;
    int amount;
}
