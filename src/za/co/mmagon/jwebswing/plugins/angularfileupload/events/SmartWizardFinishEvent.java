package za.co.mmagon.jwebswing.plugins.angularfileupload.events;

import za.co.mmagon.jwebswing.Event;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;

public abstract class SmartWizardFinishEvent extends Event
{
	
	public SmartWizardFinishEvent()
	{
		super("SmartWizardFinishEvent");
	}
	
	public void onFinish(AjaxCall call, AjaxResponse response)
	{
	
	}
	
	@Override
	public void fireEvent(AjaxCall call, AjaxResponse response)
	{
		super.fireEvent(call, response);
		onFinish(call, response);
	}
}
