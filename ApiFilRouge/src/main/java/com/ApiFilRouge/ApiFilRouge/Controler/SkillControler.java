package com.ApiFilRouge.ApiFilRouge.Controler;

import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SkillPayload.SkillCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SkillPayload.SkillUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Skill;
import com.ApiFilRouge.ApiFilRouge.Service.SkillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public class SkillControler {
    SkillService skillService;

    @PostMapping("create")
    Skill create(@RequestBody() SkillCreatePayload skill) {
        return this.skillService.create(skill);
    }
    @PutMapping("update")
    Skill update(@RequestBody() SkillUpdatePayload skill) {
        return this.skillService.update(skill);
    }

    @GetMapping("detail/{id}")
    Skill detail(@PathVariable("id") UUID skill_id) {
        return this.skillService.detail(skill_id);
    }

    @DeleteMapping("delete/{id}")
    void delete(@PathVariable("id") UUID skill_id) {
        this.skillService.delete(skill_id);

    }

    @GetMapping("list")
    List<Skill> list() {
        return this.skillService.list();
    }
}
