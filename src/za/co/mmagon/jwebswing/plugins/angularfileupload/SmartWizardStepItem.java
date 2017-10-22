package za.co.mmagon.jwebswing.plugins.angularfileupload;

import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.base.html.SmallText;

public class SmartWizardStepItem extends ListItem<SmartWizardStepItem>
{

	private static final long serialVersionUID = 1L;

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

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof SmartWizardStepItem))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		SmartWizardStepItem that = (SmartWizardStepItem) o;

		if (title != null ? !title.equals(that.title) : that.title != null)
		{
			return false;
		}
		if (stepLink != null ? !stepLink.equals(that.stepLink) : that.stepLink != null)
		{
			return false;
		}
		return stepDescription != null ? stepDescription.equals(that.stepDescription) : that.stepDescription == null;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (stepLink != null ? stepLink.hashCode() : 0);
		result = 31 * result + (stepDescription != null ? stepDescription.hashCode() : 0);
		return result;
	}
}
