package com.example.getmesocialservice.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidCreatedByValidator implements ConstraintValidator<ValidCreatedBy, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s.matches("[A-Z]")){
            return true;
        }
        else{
            return false;
        }
    }
}
