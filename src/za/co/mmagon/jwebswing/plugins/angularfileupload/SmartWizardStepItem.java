package za.co.mmagon.jwebswing.plugins.angularfileupload;

import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.base.html.SmallText;

public class SmartWizardStepItem extends ListItem<SmartWizardStepItem>
{
	private String title;
	private Link stepLink;
	private SmallText stepDescription;
	
	public SmartWizardStepItem(String title, SmallText stepDescription)
	{
		this.title = title;
		this.stepDescription = stepDescription;
	}
	
	@Override
	public void init()
	{
		if (!isInitialized())
		{
			if (stepLink == null)
			{
				stepLink = new Link<>("#step_" + getID()).setText(title + "<br/>");
			}
			stepLink.setRenderTextBeforeChildren(true);
			stepLink.add(stepDescription);
			add(stepLink);
		}
		super.init();
	}
}