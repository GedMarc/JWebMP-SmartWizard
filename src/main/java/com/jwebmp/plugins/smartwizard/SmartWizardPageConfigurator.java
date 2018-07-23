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

import com.google.inject.Singleton;
import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

@PluginInformation(pluginName = "Smart Wizard",
		pluginUniqueName = "jwebswing-smart-wizard",
		pluginDescription = "The awesome jQuery step wizard plugin with Bootstrap support",
		pluginVersion = "4",
		pluginDependancyUniqueIDs = "jquery,bootstrap",
		pluginCategories = "smartwizard,bootstrap,forms,angular,validation,wizard",
		pluginSubtitle = "The awesome jQuery step wizard plugin with Bootstrap support",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-SmartWizard",
		pluginSourceUrl = "https://github.com/GedMarc/JWebSwing-SmartWizard",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-SmartWizard/wiki",
		pluginOriginalHomepage = "http://techlaboratory.net/angularfileupload/documentation",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/SmartWizard.jar/download",
		pluginIconUrl = "jqueryuidatetimepicker.png",
		pluginIconImageUrl = "jqueryuidatetimepicker.png",
		pluginLastUpdatedDate = "2017/09/22")
@Singleton
@SuppressWarnings("unused")
public class SmartWizardPageConfigurator
		implements IPageConfigurator
{

	private static SmartWizardThemes theme = SmartWizardThemes.Circles;

	/**
	 * Configures the page for this component
	 */
	public SmartWizardPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Gets the current theme
	 *
	 * @return
	 */
	public static SmartWizardThemes getTheme()
	{
		return theme;
	}

	/**
	 * Sets the current theme
	 *
	 * @param theme
	 */
	public static void setTheme(SmartWizardThemes theme)
	{
		SmartWizardPageConfigurator.theme = theme;
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

			page.addJavaScriptReference(SmartWizardReferencePool.SmartWizardReference.getJavaScriptReference());
			page.addCssReference(SmartWizardReferencePool.SmartWizardReference.getCssReference());
			page.addCssReference(theme.getThemeReference());
		}
		return page;
	}
}
