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

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.smartwizard.SmartWizardPageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.smartwizard.implementations.SmartWizardExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.smartwizard.implementations.SmartWizardExclusionsModule;

	opens com.jwebmp.plugins.smartwizard to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard.events to com.fasterxml.jackson.databind, com.jwebmp.core;
}
