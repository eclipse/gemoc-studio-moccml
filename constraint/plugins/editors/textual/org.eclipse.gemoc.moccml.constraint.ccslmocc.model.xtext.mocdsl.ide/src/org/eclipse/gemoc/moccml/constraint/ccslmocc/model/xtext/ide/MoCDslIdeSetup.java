/*
 * generated by Xtext 2.31.0
 */
package org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.MoCDslRuntimeModule;
import org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.MoCDslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MoCDslIdeSetup extends MoCDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MoCDslRuntimeModule(), new MoCDslIdeModule()));
	}
	
}
