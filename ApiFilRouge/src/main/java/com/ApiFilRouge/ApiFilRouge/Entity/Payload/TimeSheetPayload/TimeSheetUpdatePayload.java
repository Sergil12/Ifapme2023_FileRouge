package com.ApiFilRouge.ApiFilRouge.Entity.Payload.TimeSheetPayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeSheetUpdatePayload {
    UUID timesheet_id;
    Date start_date;
    Timestamp start_hours;
    Timestamp end_hours;
    String comment;
    String timesheet_type;

    public UUID getTimeSheet_id() {
        return null;
    }
}
