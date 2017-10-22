package za.co.mmagon.jwebswing.plugins.angularfileupload.options;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

public class SmartWizardAnchorSettings extends JavaScriptPart
{
	/**
	 * Enable or disable the click option on the step header anchors
	 */
	private Boolean anchorClickable;
	/**
	 * Enable all anchors on load
	 */
	private Boolean enableAllAnchors;
	/**
	 * Make already visited steps as done
	 */
	private Boolean markDoneStep;
	/**
	 * When a step selected by url hash, all previous steps are marked done
	 */
	private Boolean markAllPreviousStepsAsDone;
	/**
	 * While navigate back done step after active step will be cleared
	 */
	private Boolean removeDoneStepOnNavigateBack;
	/**
	 * Enable/Disable the done steps navigation
	 */
	private Boolean enableAnchorOnDoneStep;

	public SmartWizardAnchorSettings()
	{
		//Nothing required
	}

	/**
	 * Enable or disable the click option on the step header anchors
	 *
	 * @return
	 */
	public Boolean getAnchorClickable()
	{
		return anchorClickable;
	}

	/**
	 * Enable or disable the click option on the step header anchors
	 *
	 * @param anchorClickable
	 *
	 * @return
	 */
	public SmartWizardAnchorSettings setAnchorClickable(Boolean anchorClickable)
	{
		this.anchorClickable = anchorClickable;
		return this;
	}

	/**
	 * Enable all anchors on load
	 *
	 * @return
	 */
	public Boolean getEnableAllAnchors()
	{
		return enableAllAnchors;
	}

	/**
	 * Enable all anchors on load
	 *
	 * @param enableAllAnchors
	 *
	 * @return
	 */
	public SmartWizardAnchorSettings setEnableAllAnchors(Boolean enableAllAnchors)
	{
		this.enableAllAnchors = enableAllAnchors;
		return this;
	}

	/**
	 * Make already visited steps as done
	 *
	 * @return
	 */
	public Boolean getMarkDoneStep()
	{
		return markDoneStep;
	}

	/**
	 * Make already visited steps as done
	 *
	 * @param markDoneStep
	 *
	 * @return
	 */
	public SmartWizardAnchorSettings setMarkDoneStep(Boolean markDoneStep)
	{
		this.markDoneStep = markDoneStep;
		return this;
	}

	/**
	 * When a step selected by url hash, all previous steps are marked done
	 *
	 * @return
	 */
	public Boolean getMarkAllPreviousStepsAsDone()
	{
		return markAllPreviousStepsAsDone;
	}

	/**
	 * When a step selected by url hash, all previous steps are marked done
	 *
	 * @param markAllPreviousStepsAsDone
	 *
	 * @return
	 */
	public SmartWizardAnchorSettings setMarkAllPreviousStepsAsDone(Boolean markAllPreviousStepsAsDone)
	{
		this.markAllPreviousStepsAsDone = markAllPreviousStepsAsDone;
		return this;
	}

	/**
	 * While navigate back done step after active step will be cleared
	 *
	 * @return
	 */
	public Boolean getRemoveDoneStepOnNavigateBack()
	{
		return removeDoneStepOnNavigateBack;
	}

	/**
	 * While navigate back done step after active step will be cleared
	 *
	 * @param removeDoneStepOnNavigateBack
	 *
	 * @return
	 */
	public SmartWizardAnchorSettings setRemoveDoneStepOnNavigateBack(Boolean removeDoneStepOnNavigateBack)
	{
		this.removeDoneStepOnNavigateBack = removeDoneStepOnNavigateBack;
		return this;
	}

	/**
	 * Enable/Disable the done steps navigation
	 *
	 * @return
	 */
	public Boolean getEnableAnchorOnDoneStep()
	{
		return enableAnchorOnDoneStep;
	}

	/**
	 * Enable/Disable the done steps navigation
	 *
	 * @param enableAnchorOnDoneStep
	 *
	 * @return
	 */
	public SmartWizardAnchorSettings setEnableAnchorOnDoneStep(Boolean enableAnchorOnDoneStep)
	{
		this.enableAnchorOnDoneStep = enableAnchorOnDoneStep;
		return this;
	}
}
