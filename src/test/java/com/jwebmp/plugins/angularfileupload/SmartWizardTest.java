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

package com.jwebmp.plugins.angularfileupload;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.SmallText;
import com.jwebmp.plugins.smartwizard.SmartWizard;
import com.jwebmp.plugins.smartwizard.SmartWizardStep;
import com.jwebmp.plugins.smartwizard.SmartWizardStepItem;
import com.jwebmp.plugins.smartwizard.SmartWizardThemes;
import com.jwebmp.plugins.smartwizard.options.SmartWizardTransitionEffects;

public class SmartWizardTest

{
	@org.junit.jupiter.api.Test
	@SuppressWarnings("unchecked")
	public void testHtml()
	{
		SmartWizard sw = new SmartWizard("test");
		sw.getSteps()
		  .add(new SmartWizardStep(new Div(), new SmartWizardStepItem("Header", new SmallText("Description"))));
		sw.getSteps()
		  .add(new SmartWizardStep(new Div(), new SmartWizardStepItem("Header", new SmallText("Description"))));
		sw.getSteps()
		  .add(new SmartWizardStep(new Div(), new SmartWizardStepItem("Header", new SmallText("Description"))));
		System.out.println(sw.toString(0));
	}

	@org.junit.jupiter.api.Test
	public void testPage()
	{
		Page p = new Page();
		SmartWizard sw = new SmartWizard("test");
		p.getBody()
		 .add(sw);
		System.out.println(p.toString(0));
	}

	@org.junit.jupiter.api.Test
	public void testJs()
	{
		SmartWizard sw = new SmartWizard("test");
		System.out.println(sw.renderJavascript());
	}

	@org.junit.jupiter.api.Test
	public void testJsOptions()
	{
		SmartWizard sw = new SmartWizard("test");

		sw.getSteps()
		  .add(new SmartWizardStep(new Div(), new SmartWizardStepItem("Header", new SmallText("Description"))));

		sw.getFeature()
		  .getOptions()
		  .setContentCache(true);
		System.out.println(sw.renderJavascript());
	}

	@org.junit.jupiter.api.Test
	public void testJsDeeperOptions()
	{
		SmartWizard sw = new SmartWizard("test");
		sw.getFeature()
		  .getOptions()
		  .setContentCache(true);
		sw.getFeature()
		  .getOptions()
		  .setCycleSteps(true);
		sw.getFeature()
		  .getOptions()
		  .getLang()
		  .setNext("Next Text");
		sw.getFeature()
		  .getOptions()
		  .setContentCache(true);

		sw.getFeature()
		  .getOptions()
		  .setTheme(SmartWizardThemes.Circles);
		sw.getFeature()
		  .getOptions()
		  .setTransitionEffect(SmartWizardTransitionEffects.slide);

		System.out.println(sw.renderJavascript());

		System.out.println(sw.toString(0));
	}

}
