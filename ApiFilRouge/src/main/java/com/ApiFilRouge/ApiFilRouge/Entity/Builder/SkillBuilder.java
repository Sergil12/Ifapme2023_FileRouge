package com.ApiFilRouge.ApiFilRouge.Entity.Builder;

import com.ApiFilRouge.ApiFilRouge.Entity.Skill;

public class SkillBuilder implements Builder<Skill>{

    String title="titre 1";
    String description="description";

    public SkillBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public SkillBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Skill build() {
        return new Skill(this.title,this.description);
    }
}

