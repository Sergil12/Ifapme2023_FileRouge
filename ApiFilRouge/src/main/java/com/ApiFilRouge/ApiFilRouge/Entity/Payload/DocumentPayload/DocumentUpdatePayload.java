package com.ApiFilRouge.ApiFilRouge.Entity.Payload.DocumentPayload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentUpdatePayload {
    UUID document_id;
    String title;
    String path;
    String content;
    String type;
    Date create_date;
}
