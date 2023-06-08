package com.ApiFilRouge.ApiFilRouge.Entity.Payload.SkillPayload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkillCreatePayload {
    String title;
    String description;
}
