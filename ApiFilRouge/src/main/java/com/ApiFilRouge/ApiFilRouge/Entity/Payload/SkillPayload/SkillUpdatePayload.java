package com.ApiFilRouge.ApiFilRouge.Entity.Payload.SkillPayload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkillUpdatePayload {
    UUID skill_id;
    String title;
    String description;
}
