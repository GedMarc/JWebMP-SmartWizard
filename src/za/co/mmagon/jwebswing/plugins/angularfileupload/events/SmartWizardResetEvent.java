package za.co.mmagon.jwebswing.plugins.angularfileupload.events;

import za.co.mmagon.jwebswing.Event;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;

public abstract class SmartWizardResetEvent extends Event
{

	public SmartWizardResetEvent()
	{
		super("SmartWizardResetEvent");
	}

	@Override
	public void fireEvent(AjaxCall call, AjaxResponse response)
	{
		super.fireEvent(call, response);
		onReset(call, response);
	}

	public abstract void onReset(AjaxCall call, AjaxResponse response);
}