/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.smartwizard;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.SmallText;

public class SmartWizardStepItem
		extends ListItem<SmartWizardStepItem>
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
	@SuppressWarnings("unchecked")
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
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
