package com.khaez.friendbirthdatecalendar.model.dbschema;

import java.util.List;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("FriendGroup")
public class FriendGroup extends BaseEntity {

    @DBRef private List<Friend> friends;

    @DBRef private Friend admin;
}
