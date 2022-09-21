package com.trevorphillips.pipprep.requests.validator;

import com.trevorphillips.pipprep.requests.RequestPojo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RequestInputParametersValidator implements ConstraintValidator<RequestInputParameters, RequestPojo> {

//    private static final int[] NUMBER_LIST_PATTERN =

    @Override
    public boolean isValid(RequestPojo requestPojo, ConstraintValidatorContext constraintValidatorContext) {
        int[] numberList = requestPojo.getListOfNumbers();


//        if (null != requestPojo && )


        return false;
    }
}
