package com.example.getmesocialservice.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidCreatedByValidator.class)
@Documented
public @interface ValidCreatedBy {
    String message() default "Invalid Input: only Lowercase(a-z) and numbers (0-9) allowed";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
