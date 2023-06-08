package com.ApiFilRouge.ApiFilRouge.Service;

import com.ApiFilRouge.ApiFilRouge.Entity.Payload.TimeSheetPayload.TimeSheetCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.TimeSheetPayload.TimeSheetUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.TimeSheet;

import java.util.List;
import java.util.UUID;

public interface TimeSheetService {
    TimeSheet create(TimeSheetCreatePayload timeSheet);
    TimeSheet  update(TimeSheetUpdatePayload timeSheet);
    TimeSheet  detail(UUID timeSheet_id);
    void delete(UUID timeSheet_id);
    List<TimeSheet> list();
}
