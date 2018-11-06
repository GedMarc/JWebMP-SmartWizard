import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.smartwizard.SmartWizardPageConfigurator;
import com.jwebmp.plugins.smartwizard.implementations.SmartWizardExclusionsModule;

module com.jwebmp.plugins.smartwizard {

	exports com.jwebmp.plugins.smartwizard;
	exports com.jwebmp.plugins.smartwizard.events;
	exports com.jwebmp.plugins.smartwizard.interfaces;
	exports com.jwebmp.plugins.smartwizard.options;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.google.guice;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with SmartWizardPageConfigurator;
	provides IGuiceScanJarExclusions with SmartWizardExclusionsModule;
	provides IGuiceScanModuleExclusions with SmartWizardExclusionsModule;

	opens com.jwebmp.plugins.smartwizard to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard.events to com.fasterxml.jackson.databind, com.jwebmp.core;
}
