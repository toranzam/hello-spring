package com.artineer.hellospring.validator;

import com.artineer.hellospring.annotation.Credit;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class CreditValidator implements ConstraintValidator<Credit, String> {


    List<String> flag = Arrays.asList(
            "A+", "A0", "A-",
            "B+", "B", "B-",
            "C+", "C", "C-",
            "D+", "D", "D-"
    );

    @Override
    public boolean isValid(String str, ConstraintValidatorContext context) {

        for (String s : flag) {
            if(str.equals(s)){
                return true;
            }
        }
        return false;
    }
}
