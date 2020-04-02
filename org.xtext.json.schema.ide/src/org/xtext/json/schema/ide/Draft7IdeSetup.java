/*
 * generated by Xtext 2.20.0
 */
package org.xtext.json.schema.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.json.schema.Draft7RuntimeModule;
import org.xtext.json.schema.Draft7StandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class Draft7IdeSetup extends Draft7StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new Draft7RuntimeModule(), new Draft7IdeModule()));
	}
	
}
