package za.co.mmagon.jwebswing.plugins.smartwizard.events;

import za.co.mmagon.jwebswing.Event;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;
import za.co.mmagon.jwebswing.plugins.smartwizard.ISmartWizardEvents;

public abstract class SmartWizardFinishEvent extends Event implements ISmartWizardEvents
{

	public SmartWizardFinishEvent()
	{
		super("SmartWizardFinishEvent");
	}

	public abstract void onFinish(AjaxCall call, AjaxResponse response);

	@Override
	public void fireEvent(AjaxCall call, AjaxResponse response)
	{
		super.fireEvent(call, response);
		onFinish(call, response);
	}
}
