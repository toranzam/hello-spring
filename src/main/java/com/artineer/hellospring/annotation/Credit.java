package com.artineer.hellospring.annotation;

import com.artineer.hellospring.validator.CreditValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CreditValidator.class )
public @interface Credit {

    String message() default "Invalid Data";
    Class<?>[] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
