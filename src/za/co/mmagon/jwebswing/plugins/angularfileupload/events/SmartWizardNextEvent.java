package za.co.mmagon.jwebswing.plugins.angularfileupload.events;

import za.co.mmagon.jwebswing.Event;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;

public abstract class SmartWizardNextEvent extends Event
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
