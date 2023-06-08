package com.ApiFilRouge.ApiFilRouge.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class TimeSheet {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "timesheet_id", updatable = false, nullable = false)

    UUID timesheet_id;
    Date start_date;
    Timestamp start_hours;
    Timestamp end_hours;
    String comment;
    String timesheet_type;

    public TimeSheet(Date start_date, Timestamp start_hours, Timestamp end_hours, String comment, String timesheet_type) {
        this.start_date = start_date;
        this.start_hours = start_hours;
        this.end_hours = end_hours;
        this.comment = comment;
        this.timesheet_type = timesheet_type;
    }
}
