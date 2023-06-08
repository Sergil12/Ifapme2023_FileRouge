package com.ApiFilRouge.ApiFilRouge.Controler;

import com.ApiFilRouge.ApiFilRouge.Entity.Payload.TimeSheetPayload.TimeSheetCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.TimeSheetPayload.TimeSheetUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.TimeSheet;
import com.ApiFilRouge.ApiFilRouge.Service.TimeSheetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public class TimeSheetControler {
    TimeSheetService timeSheetService;

    @PostMapping("create")
    TimeSheet create(@RequestBody() TimeSheetCreatePayload timeSheet) {
        return this.timeSheetService.create(timeSheet);
    }
    @PutMapping("update")
    TimeSheet update(@RequestBody() TimeSheetUpdatePayload timeSheet) {
        return this.timeSheetService.update(timeSheet);
    }

    @GetMapping("detail/{id}")
    TimeSheet detail(@PathVariable("id") UUID timeSheet_id) {
        return this.timeSheetService.detail(timeSheet_id);
    }

    @DeleteMapping("delete/{id}")
    void delete(@PathVariable("id") UUID timeSheet_id) {
        this.timeSheetService.delete(timeSheet_id);

    }

    @GetMapping("list")
    List<TimeSheet> list() {
        return this.timeSheetService.list();
    }
}
