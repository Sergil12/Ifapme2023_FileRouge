package com.ApiFilRouge.ApiFilRouge.Entity.Payload.ContractPayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ContractCreatePayload {

    String title;
    String description;
    Data start_date;
    Data end_date;
    int nb_hours_by_week;
}
