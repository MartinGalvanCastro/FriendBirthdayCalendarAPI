package com.khaez.friendbirthdatecalendar.model.dbschema;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
public abstract class BaseEntity {
    @MongoId private Long id;
}
