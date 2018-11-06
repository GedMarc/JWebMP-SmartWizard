package com.jwebmp.plugins.smartwizard.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class SmartWizardExclusionsModule
		implements IGuiceScanModuleExclusions<SmartWizardExclusionsModule>,
				           IGuiceScanJarExclusions<SmartWizardExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-smart-wizard-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.smartwizard");
		return strings;
	}
}
