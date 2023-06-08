package com.ApiFilRouge.ApiFilRouge.Service;

import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SkillPayload.SkillCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SkillPayload.SkillUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Skill;

import java.util.List;
import java.util.UUID;

public interface SkillService {
    Skill create(SkillCreatePayload skill);
    Skill  update(SkillUpdatePayload skill);
    Skill detail(UUID skill_id);
    void delete(UUID skill_id);
    List<Skill> list();
}
