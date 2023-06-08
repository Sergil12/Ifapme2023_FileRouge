package com.ApiFilRouge.ApiFilRouge.Service.impl;

import com.ApiFilRouge.ApiFilRouge.Entity.Builder.TimeSheetBuilder;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.TimeSheetPayload.TimeSheetCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.TimeSheetPayload.TimeSheetUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.TimeSheet;
import com.ApiFilRouge.ApiFilRouge.Repository.TimeSheetRepository;
import com.ApiFilRouge.ApiFilRouge.Service.TimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TimeSheetServiceImpl implements TimeSheetService {
    @Override
    public TimeSheet create(TimeSheetCreatePayload timeSheet) {
        TimeSheet newTimeSheet= new TimeSheetBuilder()
                .setStart_date(timeSheet.getStart_date())
                .setEnd_hours(timeSheet.getEnd_hours())
                .setEnd_hours(timeSheet.getEnd_hours())
                .setComment(timeSheet.getComment())
                .setTimesheet_type(timeSheet.getTimesheet_type())
                .build();
        return this.timeSheetRepository.save(newTimeSheet);
    }

    @Override
    public TimeSheet update(TimeSheetUpdatePayload timeSheet) {
        TimeSheet detail = this.detail(timeSheet.getTimeSheet_id());
        if (detail != null) {
            detail.setStart_date(timeSheet.getStart_date());
            detail.setEnd_hours(timeSheet.getEnd_hours());
            detail.setEnd_hours(timeSheet.getEnd_hours());
            detail.setComment(timeSheet.getComment());
            detail.setTimesheet_type(timeSheet.getTimesheet_type());
            return this.timeSheetRepository.save(detail);
        }
        return detail;
    }
    @Override
    public TimeSheet detail(UUID timeSheet_id) {
            return this.timeSheetRepository.findById(timeSheet_id).orElse(null);
    }

    @Override
    public void delete(UUID timeSheet_id) {
        TimeSheet detail = this.detail(timeSheet_id);
        if (detail != null) {
            this.timeSheetRepository.delete(detail);
        }
    }

    @Override
    public List<TimeSheet> list() {
        return this.timeSheetRepository.findAll();
    }
    @Autowired
    TimeSheetRepository timeSheetRepository;
}
