package com.mcg.apitester.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value={ ElementType.METHOD, ElementType.TYPE } )
public @interface ApiErrors {

	public ApiError[] value() default {};
	
}
