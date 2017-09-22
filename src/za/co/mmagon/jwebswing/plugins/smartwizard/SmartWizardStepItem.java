package za.co.mmagon.jwebswing.plugins.smartwizard;

import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.base.html.SmallText;

public class SmartWizardStepItem extends ListItem<SmartWizardStepItem>
{
	private Link stepLink;
	private SmallText stepTitle;
	
	public SmartWizardStepItem(SmallText stepTitle)
	{
		this.stepTitle = stepTitle;
	}
	
	@Override
	public void init()
	{
		if (!isInitialized())
		{
			if (stepLink == null)
			{
				stepLink = new Link("#step_" + getID() + "_" + getParent().getChildren().indexOf(this));
			}
			stepLink.add(stepTitle);
			add(stepLink);
		}
		super.init();
	}
}
