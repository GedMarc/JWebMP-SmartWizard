package za.co.mmagon.jwebswing.plugins.smartwizard;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.smartwizard.options.functions.SmartWizardCancelFunction;
import za.co.mmagon.jwebswing.plugins.smartwizard.options.functions.SmartWizardFinishFunction;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@ComponentInformation(name = "SmartWizard"
		, description = "Smart Wizard is a flexible and heavily customizable jQuery step wizard plugin with Bootstrap support. "
		, url = "https://github.com/GedMarc/JWebSwing-SmartWizard")
public class SmartWizard<J extends SmartWizard<J>> extends DivSimple<J>
{
	/**
	 * My Feature
	 */
	private final SmartWizardFeature feature;
	/**
	 * The actual steps
	 */
	private List<SmartWizardStep> steps;
	/**
	 * The actual content div
	 */
	private Div contentDivs;
	
	/**
	 * Configures the page for this component
	 */
	public SmartWizard()
	{
		addFeature(feature = new SmartWizardFeature(this));
	}
	
	@Override
	public void init()
	{
		if (!isInitialized())
		{
			getFeature().getOptions().getToolbarSettings().getToolbarExtraButtons().add(new SmartWizardFinishFunction());
			getFeature().getOptions().getToolbarSettings().getToolbarExtraButtons().add(new SmartWizardCancelFunction());
			for (SmartWizardStep step : getSteps())
			{
				za.co.mmagon.jwebswing.base.html.List stepList = new za.co.mmagon.jwebswing.base.html.List();
				stepList.add(step.getStepTitle());
				
				getContentDivs().add(step.getStepContents());
				step.getStepContents().setID("step_" + step.getStepTitle().getID() + "_" + stepList.getChildren().indexOf(step.getStepTitle()));
				
				add(stepList);
				add(getContentDivs());
			}
		}
		super.init();
	}
	
	/**
	 * Gets the current steps for this wizard
	 *
	 * @return
	 */
	@NotNull
	public List<SmartWizardStep> getSteps()
	{
		if (steps == null)
		{
			setSteps(new ArrayList<>());
		}
		return steps;
	}
	
	/**
	 * Sets the steps for this Smart Wizard
	 *
	 * @param steps
	 *
	 * @return
	 */
	public J setSteps(List<SmartWizardStep> steps)
	{
		this.steps = steps;
		return (J) this;
	}
	
	/**
	 * Returns the content div
	 *
	 * @return
	 */
	@NotNull
	protected Div getContentDivs()
	{
		if (contentDivs == null)
		{
			setContentDivs(new Div());
		}
		return contentDivs;
	}
	
	/**
	 * Sets the content divs
	 *
	 * @param contentDivs
	 *
	 * @return
	 */
	protected J setContentDivs(Div contentDivs)
	{
		this.contentDivs = contentDivs;
		if (this.contentDivs != null)
		{
		
		}
		return (J) this;
	}
	
	/**
	 * Returns this feature
	 *
	 * @return
	 */
	@NotNull
	public SmartWizardFeature getFeature()
	{
		return feature;
	}
}
