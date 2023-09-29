package com.khaez.friendbirthdatecalendar.model.dbschema;

import com.khaez.friendbirthdatecalendar.validators.isAdult.IsAdult;
import jakarta.validation.constraints.Past;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Friend")
public class Friend extends BaseUser {

    @Past(message = "Date of birth should be on the past")
    @IsAdult
    private LocalDate dateOfBirth;

    private List<FriendGroup> friendGroups;
}
