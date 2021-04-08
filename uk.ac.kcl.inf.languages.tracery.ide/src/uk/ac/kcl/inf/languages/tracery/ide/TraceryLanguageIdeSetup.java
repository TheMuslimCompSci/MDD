/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.kcl.inf.languages.tracery.TraceryLanguageRuntimeModule;
import uk.ac.kcl.inf.languages.tracery.TraceryLanguageStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class TraceryLanguageIdeSetup extends TraceryLanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new TraceryLanguageRuntimeModule(), new TraceryLanguageIdeModule()));
	}
	
}
