package za.co.mmagon.jwebswing.plugins.angularfileupload;

import za.co.mmagon.jwebswing.base.html.Div;

import java.io.Serializable;

public class SmartWizardStep implements Serializable
{

	private static final long serialVersionUID = 1L;
	/**
	 * The actual contents of the step
	 */
	private Div stepContents;
	/**
	 * The step title
	 */
	private SmartWizardStepItem stepTitle;

	/**
	 * Initial Constructor
	 */
	private SmartWizardStep()
	{
		//Nothing Needed
	}

	/**
	 * Construct a new Smart Wizard Step with the given items
	 *
	 * @param stepContents
	 * @param stepTitle
	 */
	public SmartWizardStep(Div stepContents, SmartWizardStepItem stepTitle)
	{
		this.stepContents = stepContents;
		this.stepTitle = stepTitle;
	}


	/**
	 * Returns the step contents
	 *
	 * @return
	 */
	public Div getStepContents()
	{
		return stepContents;
	}

	/**
	 * Sets the step contents for this item
	 *
	 * @param stepContents
	 *
	 * @return
	 */
	public SmartWizardStep setStepContents(Div stepContents)
	{
		this.stepContents = stepContents;
		return this;
	}

	/**
	 * Returns the step title
	 *
	 * @return
	 */
	public SmartWizardStepItem getStepTitle()
	{
		return stepTitle;
	}

	/**
	 * @param stepTitle
	 *
	 * @return
	 */
	public SmartWizardStep setStepTitle(SmartWizardStepItem stepTitle)
	{
		this.stepTitle = stepTitle;
		return this;
	}
}
