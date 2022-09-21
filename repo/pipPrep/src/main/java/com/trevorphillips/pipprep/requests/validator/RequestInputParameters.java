package com.trevorphillips.pipprep.requests.validator;


import javax.validation.Constraint;

@Constraint(validatedBy = RequestInputParametersValidator.class)
public @interface RequestInputParameters {
}
