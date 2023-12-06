package br.com.fujideia.iesp.tecback.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = SenhaValidaValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface SenhaValida {

    String message() default "Senha inválida";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
