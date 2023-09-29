package com.khaez.friendbirthdatecalendar.validators.isAdult;

import jakarta.validation.Constraint;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IsAdultValidator.class)
@Documented
public @interface IsAdult {
    String message() default "{message.key}";
}
