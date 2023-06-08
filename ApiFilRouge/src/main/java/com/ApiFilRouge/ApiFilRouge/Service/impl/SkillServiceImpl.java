package com.ApiFilRouge.ApiFilRouge.Service.impl;

import com.ApiFilRouge.ApiFilRouge.Entity.Builder.SkillBuilder;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SkillPayload.SkillCreatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Payload.SkillPayload.SkillUpdatePayload;
import com.ApiFilRouge.ApiFilRouge.Entity.Salary;
import com.ApiFilRouge.ApiFilRouge.Entity.Skill;
import com.ApiFilRouge.ApiFilRouge.Repository.SalaryRepository;
import com.ApiFilRouge.ApiFilRouge.Repository.SkillRepository;
import com.ApiFilRouge.ApiFilRouge.Service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SkillServiceImpl implements SkillService {
    @Override
    public Skill create(SkillCreatePayload skill) {
        Skill newSkill= new SkillBuilder()
                .setDescription(skill.getDescription())
                .setTitle(skill.getTitle())
                .build();
        return this.skillRepository.save(newSkill);
    }

    @Override
    public Skill update(SkillUpdatePayload skill) {
        Skill detail = this.detail(skill.getSkill_id());
        if (detail != null) {
            detail.setDescription(skill.getDescription());
            detail.setTitle(skill.getTitle());
            return this.skillRepository.save(detail);
        }
        return detail;
    }

    @Override
    public Skill detail(UUID skill_id) {
        return this.skillRepository.findById(skill_id).orElse(null);
    }

    @Override
    public void delete(UUID skill_id) {
        Skill detail = this.detail(skill_id);
        if (detail != null) {
            this.skillRepository.delete(detail);
        }

    }

    @Override
    public List<Skill> list() {
        return this.skillRepository.findAll();
    }
    @Autowired
    SkillRepository skillRepository;
}
