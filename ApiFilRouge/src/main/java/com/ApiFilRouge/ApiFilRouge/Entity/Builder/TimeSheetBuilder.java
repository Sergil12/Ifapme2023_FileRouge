package com.ApiFilRouge.ApiFilRouge.Entity.Builder;

import com.ApiFilRouge.ApiFilRouge.Entity.TimeSheet;

import java.sql.Timestamp;
import java.util.Date;

public class TimeSheetBuilder implements Builder<TimeSheet> {

    Date start_date;
    Timestamp start_hours;
    Timestamp end_hours;
    String comment;
    String timesheet_type;

    public TimeSheetBuilder setStart_date(Date start_date) {
        this.start_date = start_date;
        return this;
    }

    public TimeSheetBuilder setStart_hours(Timestamp start_hours) {
        this.start_hours = start_hours;
        return this;
    }

    public TimeSheetBuilder setEnd_hours(Timestamp end_hours) {
        this.end_hours = end_hours;
        return this;
    }

    public TimeSheetBuilder setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public TimeSheetBuilder setTimesheet_type(String timesheet_type) {
        this.timesheet_type = timesheet_type;
        return this;
    }

    @Override
    public TimeSheet build() {
        return new TimeSheet(this.start_date, this.start_hours, this.end_hours, this.comment, this.timesheet_type);
    }
}
