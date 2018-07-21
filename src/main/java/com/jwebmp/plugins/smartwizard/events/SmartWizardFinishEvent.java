package com.jwebmp.plugins.smartwizard.events;

import com.jwebmp.core.Event;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.plugins.smartwizard.ISmartWizardEvents;

public abstract class SmartWizardFinishEvent
		extends Event
		implements ISmartWizardEvents
{

	public SmartWizardFinishEvent()
	{
		super("SmartWizardFinishEvent");
	}

	@Override
	public void fireEvent(AjaxCall call, AjaxResponse response)
	{
		super.fireEvent(call, response);
		onFinish(call, response);
	}

	public abstract void onFinish(AjaxCall call, AjaxResponse response);
}
