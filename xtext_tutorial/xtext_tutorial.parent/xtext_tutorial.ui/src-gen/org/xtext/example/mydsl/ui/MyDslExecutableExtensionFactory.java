/*
 * generated by Xtext 2.28.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import xtext_tutorial.ui.internal.Xtext_tutorialActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Xtext_tutorialActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Xtext_tutorialActivator activator = Xtext_tutorialActivator.getInstance();
		return activator != null ? activator.getInjector(Xtext_tutorialActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL) : null;
	}

}
