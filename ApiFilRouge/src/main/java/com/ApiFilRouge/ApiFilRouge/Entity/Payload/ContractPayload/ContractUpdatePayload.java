package com.ApiFilRouge.ApiFilRouge.Entity.Payload.ContractPayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractUpdatePayload {
    UUID contract_id;
    String title;
    String description;
    Date start_date;
    Date end_date;
    int nb_hours_by_week;
}
