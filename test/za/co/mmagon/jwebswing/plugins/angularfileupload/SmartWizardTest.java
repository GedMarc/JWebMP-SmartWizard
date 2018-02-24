package za.co.mmagon.jwebswing.plugins.angularfileupload;

import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.SmallText;
import za.co.mmagon.jwebswing.plugins.smartwizard.SmartWizard;
import za.co.mmagon.jwebswing.plugins.smartwizard.SmartWizardStep;
import za.co.mmagon.jwebswing.plugins.smartwizard.SmartWizardStepItem;
import za.co.mmagon.jwebswing.plugins.smartwizard.SmartWizardThemes;
import za.co.mmagon.jwebswing.plugins.smartwizard.options.SmartWizardTransitionEffects;

public class SmartWizardTest extends BaseTestClass
{
	@org.junit.jupiter.api.Test
	@SuppressWarnings("unchecked")
	public void testHtml()
	{
		SmartWizard sw = new SmartWizard("test");
		sw.getSteps().add(new SmartWizardStep(new Div(), new SmartWizardStepItem("Header", new SmallText("Description"))));
		sw.getSteps().add(new SmartWizardStep(new Div(), new SmartWizardStepItem("Header", new SmallText("Description"))));
		sw.getSteps().add(new SmartWizardStep(new Div(), new SmartWizardStepItem("Header", new SmallText("Description"))));
		System.out.println(sw.toString(0));
	}

	@org.junit.jupiter.api.Test
	public void testPage()
	{
		Page p = getInstance();
		SmartWizard sw = new SmartWizard("test");
		p.add(sw);
		System.out.println(p.toString(0));
	}

	@org.junit.jupiter.api.Test
	public void testJs()
	{
		SmartWizard sw = new SmartWizard("test");
		System.out.println(sw.renderJavascript());
	}

	@org.junit.jupiter.api.Test
	public void testJsOptions()
	{
		SmartWizard sw = new SmartWizard("test");

		sw.getSteps().add(new SmartWizardStep(new Div(), new SmartWizardStepItem("Header", new SmallText("Description"))));

		sw.getFeature().getOptions().setContentCache(true);
		System.out.println(sw.renderJavascript());
	}

	@org.junit.jupiter.api.Test
	public void testJsDeeperOptions()
	{
		SmartWizard sw = new SmartWizard("test");
		sw.getFeature().getOptions().setContentCache(true);
		sw.getFeature().getOptions().setCycleSteps(true);
		sw.getFeature().getOptions().getLang().setNext("Next Text");
		sw.getFeature().getOptions().setContentCache(true);

		sw.getFeature().getOptions().setTheme(SmartWizardThemes.Circles);
		sw.getFeature().getOptions().setTransitionEffect(SmartWizardTransitionEffects.slide);

		System.out.println(sw.renderJavascript());

		System.out.println(sw.toString(0));
	}

}
