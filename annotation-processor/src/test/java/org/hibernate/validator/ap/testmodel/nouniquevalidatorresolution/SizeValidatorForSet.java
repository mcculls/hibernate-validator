/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.ap.testmodel.nouniquevalidatorresolution;

import java.util.Set;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SizeValidatorForSet implements ConstraintValidator<Size, Set> {

	public void initialize(Size constraintAnnotation) {
	}

	public boolean isValid(Set object, ConstraintValidatorContext constraintContext) {
		return true;
	}
}
