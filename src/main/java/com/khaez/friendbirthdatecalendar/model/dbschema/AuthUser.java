package com.khaez.friendbirthdatecalendar.model.dbschema;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder(toBuilder = true)
@Document("authUser")
public class AuthUser extends BaseUser {

    @NotEmpty(message = "Password cannot be empty")
    @NotNull(message = "Password cannot be null")
    private String password;

    private String sessionToken;

    private String resetPasswordToken;
}
