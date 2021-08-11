package com.mmm.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

    public String value() default "xyz.com";
    public String message () default "email must ends with \"xyz.com\"";

    //two lines below uses for grouping annotations and other
    // they are necessary for correct work of annotation
    public Class <?>[] groups () default {};
    public Class <? extends Payload>[] payload () default {};
}
