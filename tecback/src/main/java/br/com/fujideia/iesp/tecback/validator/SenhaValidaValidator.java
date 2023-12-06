package br.com.fujideia.iesp.tecback.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SenhaValidaValidator implements ConstraintValidator<SenhaValida, String> {

    @Override
    public void initialize(SenhaValida constraintAnnotation) {
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        return password != null &&
                password.matches(   "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$");
    }
}
