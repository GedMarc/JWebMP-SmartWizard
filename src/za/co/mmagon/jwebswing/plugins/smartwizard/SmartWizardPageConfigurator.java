package za.co.mmagon.jwebswing.plugins.smartwizard;

import com.google.inject.Singleton;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

@PluginInformation(pluginName = "Smart Wizard",
		pluginUniqueName = "jwebswing-smart-wizard",
		pluginDescription = "The awesome jQuery step wizard plugin with Bootstrap support",
		pluginVersion = "4",
		pluginDependancyUniqueIDs = "jquery,bootstrap",
		pluginCategories = "Forms, Wizards",
		pluginSubtitle = "The awesome jQuery step wizard plugin with Bootstrap support",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-SmartWizard",
		pluginSourceUrl = "https://github.com/GedMarc/JWebSwing-SmartWizard",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-SmartWizard/wiki",
		pluginOriginalHomepage = "http://techlaboratory.net/smartwizard/documentation",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/SmartWizard.jar/download",
		pluginIconUrl = "jqueryuidatetimepicker.png",
		pluginIconImageUrl = "jqueryuidatetimepicker.png",
		pluginLastUpdatedDate = "2017/09/22"
)
@Singleton
public class SmartWizardPageConfigurator extends PageConfigurator
{
	
	private static SmartWizardThemes theme = SmartWizardThemes.Arrows;
	
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
			page.addJavaScriptReference(SmartWizardReferencePool.SmartWizardReference.getJavaScriptReference());
			page.addCssReference(SmartWizardReferencePool.SmartWizardReference.getCssReference());
			page.addCssReference(SmartWizardThemes.Circles.getThemeReference());
		}
		return page;
	}
}
