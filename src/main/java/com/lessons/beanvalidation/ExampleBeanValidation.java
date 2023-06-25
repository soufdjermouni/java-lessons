package com.lessons.beanvalidation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Annotation Hibernate validator
 */
public class ExampleBeanValidation {

    public static void main(String[] args) {

        //Programmatic Validation
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        UserToValidate user = new UserToValidate();
        user.setWorking(true);
        user.setAboutMe("Its all about me!");
        user.setAge(50);

        Set<ConstraintViolation<UserToValidate>> violations = validator.validate(user);
        violations.stream().forEach(System.out::println);

        System.out.println("---------------");
        List<@NotEmpty String> preferences = new ArrayList<>();
        preferences.add("");
        preferences.add(" ");
        preferences.add("element1");
        System.out.println(preferences.size());
        preferences.stream().forEach(System.out::println);

    }
}
