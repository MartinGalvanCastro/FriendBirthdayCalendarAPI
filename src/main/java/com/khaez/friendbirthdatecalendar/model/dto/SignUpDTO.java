package com.khaez.friendbirthdatecalendar.model.dto;

import com.khaez.friendbirthdatecalendar.validators.isAdult.IsAdult;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import java.time.LocalDate;
import lombok.Data;

@Data
public class SignUpDTO {

    @NotEmpty(message = "Name cannot be empty")
    @NotNull(message = "Name cannot be null")
    private String name;

    @NotEmpty(message = "Email cannot be empty")
    @NotNull(message = "Email cannot be null")
    @Email(message = "Should be a valid email")
    private String email;

    @NotEmpty(message = "Password cannot be empty")
    @NotNull(message = "Password cannot be null")
    private String password;

    @Past(message = "Date of birth should be on the past")
    @IsAdult
    private LocalDate dateOfBirth;
}
