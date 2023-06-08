package com.ApiFilRouge.ApiFilRouge.Entity.Payload.DocumentPayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentCreatePayload {
    String title;
    String path;
    String content;
    String type;
    Data create_date;
}
