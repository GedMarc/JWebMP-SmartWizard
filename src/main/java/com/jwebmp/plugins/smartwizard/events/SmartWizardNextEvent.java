package com.jwebmp.plugins.smartwizard.events;

import com.jwebmp.Event;
import com.jwebmp.base.ajax.AjaxCall;
import com.jwebmp.base.ajax.AjaxResponse;
import com.jwebmp.plugins.smartwizard.ISmartWizardEvents;

public abstract class SmartWizardNextEvent
		extends Event
		implements ISmartWizardEvents
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
