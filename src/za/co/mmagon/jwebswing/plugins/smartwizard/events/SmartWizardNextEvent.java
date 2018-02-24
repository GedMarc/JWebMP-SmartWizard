package za.co.mmagon.jwebswing.plugins.smartwizard.events;

import za.co.mmagon.jwebswing.Event;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;
import za.co.mmagon.jwebswing.plugins.smartwizard.ISmartWizardEvents;

public abstract class SmartWizardNextEvent extends Event implements ISmartWizardEvents
{

	public SmartWizardNextEvent()
	{
		super("SmartWizardNextEvent");
	}

	@Override
	public void fireEvent(AjaxCall call, AjaxResponse response)
	{
		super.fireEvent(call, response);
		onNext(call, response);
	}

	public abstract void onNext(AjaxCall call, AjaxResponse response);
}
