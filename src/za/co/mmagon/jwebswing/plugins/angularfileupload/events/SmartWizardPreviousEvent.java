package za.co.mmagon.jwebswing.plugins.angularfileupload.events;

import za.co.mmagon.jwebswing.Event;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;

public abstract class SmartWizardPreviousEvent extends Event
{

	public SmartWizardPreviousEvent()
	{
		super("SmartWizardPreviousEvent");
	}

	@Override
	public void fireEvent(AjaxCall call, AjaxResponse response)
	{
		super.fireEvent(call, response);
		onPrevious(call, response);
	}

	public abstract void onPrevious(AjaxCall call, AjaxResponse response);
}
