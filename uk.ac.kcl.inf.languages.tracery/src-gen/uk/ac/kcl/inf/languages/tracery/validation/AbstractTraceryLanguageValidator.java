/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractTraceryLanguageValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage.eINSTANCE);
		return result;
	}
}
