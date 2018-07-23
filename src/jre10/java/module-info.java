import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.smartwizard.SmartWizardPageConfigurator;

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

	provides IPageConfigurator with SmartWizardPageConfigurator;

}
