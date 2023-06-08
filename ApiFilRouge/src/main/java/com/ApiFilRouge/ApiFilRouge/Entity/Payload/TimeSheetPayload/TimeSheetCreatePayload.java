package com.ApiFilRouge.ApiFilRouge.Entity.Payload.TimeSheetPayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeSheetCreatePayload {
    Date start_date;
    Timestamp start_hours;
    Timestamp end_hours;
    String comment;
    String timesheet_type;
}
