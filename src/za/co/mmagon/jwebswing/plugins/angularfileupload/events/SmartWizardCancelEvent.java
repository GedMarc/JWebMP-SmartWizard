package za.co.mmagon.jwebswing.plugins.angularfileupload.events;

import za.co.mmagon.jwebswing.Event;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;

public abstract class SmartWizardCancelEvent extends Event
{

	public SmartWizardCancelEvent()
	{
		super("SmartWizardCancelEvent");
	}

	@Override
	public void fireEvent(AjaxCall call, AjaxResponse response)
	{
		super.fireEvent(call, response);
		onCancel(call, response);
	}

	public void onCancel(AjaxCall call, AjaxResponse response)
	{

	}
}
