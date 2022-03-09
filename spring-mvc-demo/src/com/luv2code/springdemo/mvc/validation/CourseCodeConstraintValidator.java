package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>{
	
	private String coursePrefix;
	
	@Override 
	public void initialize(CourseCode theCourseCode) {
		//To do Auto generated method stub 
		coursePrefix=theCourseCode.value();
		
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		boolean result;
		if(theCode!=null) {
				 result = theCode.startsWith(coursePrefix);
				 return result;
		}
		else {
			return false;
		}
	}
}
	

