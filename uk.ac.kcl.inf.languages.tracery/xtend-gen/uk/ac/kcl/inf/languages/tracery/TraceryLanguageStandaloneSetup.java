/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery;

import uk.ac.kcl.inf.languages.tracery.TraceryLanguageStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TraceryLanguageStandaloneSetup extends TraceryLanguageStandaloneSetupGenerated {
  public static void doSetup() {
    new TraceryLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}