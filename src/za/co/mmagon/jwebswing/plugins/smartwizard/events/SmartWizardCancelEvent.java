package za.co.mmagon.jwebswing.plugins.smartwizard.events;

import za.co.mmagon.jwebswing.Event;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;
import za.co.mmagon.jwebswing.plugins.smartwizard.ISmartWizardEvents;

public abstract class SmartWizardCancelEvent extends Event implements ISmartWizardEvents
{

	public SmartWizardCancelEvent()
	{
		super("SmartWizardCancelEvent");
	}

	public SmartWizardCancelEvent(ComponentHierarchyBase component)
	{
		super(component);
	}

	@Override
	public void fireEvent(AjaxCall call, AjaxResponse response)
	{
		super.fireEvent(call, response);
		onCancel(call, response);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		//addQuery();
	}

	public abstract void onCancel(AjaxCall call, AjaxResponse response);
}
