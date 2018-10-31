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

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.smartwizard.options.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * All the options
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 4, 2015
 */
public class SmartWizardOptions<J extends SmartWizardOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * specify the selected step on the first load Default 0
	 **/
	private Integer selected;
	/**
	 * enable/disable left/right keys are used if enabled Default    key navigation. Default TRUE
	 **/
	private Boolean keyNavigation;
	/**
	 * Automatically adjust content height Default TRUE
	 **/
	private Boolean autoAdjustHeight;
	/**
	 * Allows to cycle the navigation of steps Default FALSE
	 **/
	private Boolean cycleSteps;
	/**
	 * Enable the back button support Default TRUE
	 **/
	private Boolean backButtonSupport;
	/**
	 * Enable selection of the step based on url hash Default TRUE
	 **/
	private Boolean useURLhash;
	/**
	 * Show url hash based on step Default TRUE
	 **/
	private Boolean showStepURLhash;
	/** Specify the ajax content url, setting null will disable ajax contents. If you want to use ajax content only for a specific step
	 * just add a data-content-url with the anchor tag of the step header Default null  **/
	/**
	 * On or Off caching of step contents on ajax calls, if false content is fetched always from ajax url Default TRUE
	 **/
	private Boolean contentCache;
	/**
	 * Provide extra settings for step ajax content calls Default {}
	 **/
	private SmartWizardAjaxSettings ajaxSettings;
	/**
	 * an array of step numbers to show as disabled Default []
	 **/
	private List<Integer> disabledSteps;
	/**
	 * an array of step numbers to show as error steps Default []
	 **/
	private List<Integer> errorSteps;
	/**
	 * an array of step numbers to be hidden Default []
	 **/
	private List<Integer> hiddenSteps;
	/**
	 * name of the theme to use. Remember to include the theme css also Default 'default'
	 **/
	private SmartWizardThemes theme;
	/**
	 * Animation effect on step navigation Default none
	 **/
	private SmartWizardTransitionEffects transitionEffect;
	/**
	 * Number or String Default 400
	 **/
	private Integer transitionSpeed;
	/**
	 * An array with grouped settings for the toolbar
	 */
	private SmartWizardLangOptions lang;
	/**
	 * An array with grouped settings for the toolbar
	 */
	private SmartWizardToolbarSettings toolbarSettings;
	/**
	 * List of anchor settings
	 */
	private SmartWizardAnchorSettings anchorSettings;

	/**
	 * The options for the component
	 */
	public SmartWizardOptions()
	{
		//Nothing Needed
	}

	/**
	 * specify the selected step on the first load Default 0
	 *
	 * @return
	 */
	public Integer getSelected()
	{
		return selected;
	}

	/**
	 * specify the selected step on the first load Default 0
	 *
	 * @param selected
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSelected(Integer selected)
	{
		this.selected = selected;
		return (J) this;
	}

	/**
	 * enable/disable left/right keys are used if enabled Default    key navigation. Default TRUE
	 *
	 * @return
	 */
	public Boolean getKeyNavigation()
	{
		return keyNavigation;
	}

	/**
	 * enable/disable left/right keys are used if enabled Default    key navigation. Default TRUE
	 *
	 * @param keyNavigation
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setKeyNavigation(Boolean keyNavigation)
	{
		this.keyNavigation = keyNavigation;
		return (J) this;
	}

	/**
	 * Automatically adjust content height Default TRUE
	 *
	 * @return
	 */
	public Boolean getAutoAdjustHeight()
	{
		return autoAdjustHeight;
	}

	/**
	 * Automatically adjust content height Default TRUE
	 *
	 * @param autoAdjustHeight
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAutoAdjustHeight(Boolean autoAdjustHeight)
	{
		this.autoAdjustHeight = autoAdjustHeight;
		return (J) this;
	}

	/**
	 * Allows to cycle the navigation of steps Default FALSE
	 *
	 * @return
	 */
	public Boolean getCycleSteps()
	{
		return cycleSteps;
	}

	/**
	 * Allows to cycle the navigation of steps Default FALSE
	 *
	 * @param cycleSteps
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCycleSteps(Boolean cycleSteps)
	{
		this.cycleSteps = cycleSteps;
		return (J) this;
	}

	/**
	 * Enable the back button support Default TRUE
	 *
	 * @return
	 */
	public Boolean getBackButtonSupport()
	{
		return backButtonSupport;
	}

	/**
	 * Enable the back button support Default TRUE
	 *
	 * @param backButtonSupport
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBackButtonSupport(Boolean backButtonSupport)
	{
		this.backButtonSupport = backButtonSupport;
		return (J) this;
	}

	/**
	 * Enable selection of the step based on url hash Default TRUE
	 *
	 * @return
	 */
	public Boolean getUseURLhash()
	{
		return useURLhash;
	}

	/**
	 * Enable selection of the step based on url hash Default TRUE
	 *
	 * @param useURLhash
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setUseURLhash(Boolean useURLhash)
	{
		this.useURLhash = useURLhash;
		return (J) this;
	}

	/**
	 * Show url hash based on step Default TRUE
	 *
	 * @return
	 */
	public Boolean getShowStepURLhash()
	{
		return showStepURLhash;
	}

	/**
	 * Show url hash based on step Default TRUE
	 *
	 * @param showStepURLhash
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowStepURLhash(Boolean showStepURLhash)
	{
		this.showStepURLhash = showStepURLhash;
		return (J) this;
	}

	/**
	 * Specify the ajax content url, setting null will disable ajax contents. If you want to use ajax content only for a specific step
	 * just add a data-content-url with the anchor tag of the step header Default null  **/
	/**
	 * On or Off caching of step contents on ajax calls, if false content is fetched always from ajax url Default TRUE
	 *
	 * @return
	 */
	public Boolean getContentCache()
	{
		return contentCache;
	}

	/**
	 * Specify the ajax content url, setting null will disable ajax contents. If you want to use ajax content only for a specific step
	 * just add a data-content-url with the anchor tag of the step header Default null  **/
	/**
	 * On or Off caching of step contents on ajax calls, if false content is fetched always from ajax url Default TRUE
	 *
	 * @param contentCache
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setContentCache(Boolean contentCache)
	{
		this.contentCache = contentCache;
		return (J) this;
	}

	/**
	 * Provide extra settings for step ajax content calls Default {}
	 *
	 * @return
	 */
	@NotNull
	public SmartWizardAjaxSettings getAjaxSettings()
	{
		if (ajaxSettings == null)
		{
			ajaxSettings = new SmartWizardAjaxSettings();
		}
		return ajaxSettings;
	}

	/**
	 * Provide extra settings for step ajax content calls Default {}
	 *
	 * @param ajaxSettings
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAjaxSettings(SmartWizardAjaxSettings ajaxSettings)
	{
		this.ajaxSettings = ajaxSettings;
		return (J) this;
	}

	/**
	 * an array of step numbers to show as disabled Default []
	 *
	 * @return
	 */
	@NotNull
	public List<Integer> getDisabledSteps()
	{
		if (disabledSteps == null)
		{
			disabledSteps = new ArrayList<>();
		}
		return disabledSteps;
	}

	/**
	 * an array of step numbers to show as disabled Default []
	 *
	 * @param disabledSteps
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabledSteps(List<Integer> disabledSteps)
	{
		this.disabledSteps = disabledSteps;
		return (J) this;
	}

	/**
	 * an array of step numbers to show as error steps Default []
	 *
	 * @return
	 */
	@NotNull
	public List<Integer> getErrorSteps()
	{
		if (errorSteps == null)
		{
			errorSteps = new ArrayList<>();
		}
		return errorSteps;
	}

	/**
	 * an array of step numbers to show as error steps Default []
	 *
	 * @param errorSteps
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setErrorSteps(List<Integer> errorSteps)
	{
		this.errorSteps = errorSteps;
		return (J) this;
	}

	/**
	 * an array of step numbers to be hidden Default []
	 *
	 * @return
	 */
	@NotNull
	public List<Integer> getHiddenSteps()
	{
		if (hiddenSteps == null)
		{
			hiddenSteps = new ArrayList<>();
		}
		return hiddenSteps;
	}

	/**
	 * an array of step numbers to be hidden Default []
	 *
	 * @param hiddenSteps
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHiddenSteps(List<Integer> hiddenSteps)
	{
		this.hiddenSteps = hiddenSteps;
		return (J) this;
	}

	/**
	 * name of the theme to use. Remember to include the theme css also Default 'default'
	 *
	 * @return
	 */
	public SmartWizardThemes getTheme()
	{
		return theme;
	}

	/**
	 * name of the theme to use. Remember to include the theme css also Default 'default'
	 *
	 * @param theme
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTheme(SmartWizardThemes theme)
	{
		this.theme = theme;
		return (J) this;
	}

	/**
	 * Animation effect on step navigation Default none
	 *
	 * @return
	 */
	public SmartWizardTransitionEffects getTransitionEffect()
	{
		return transitionEffect;
	}

	/**
	 * Animation effect on step navigation Default none
	 *
	 * @param transitionEffect
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTransitionEffect(SmartWizardTransitionEffects transitionEffect)
	{
		this.transitionEffect = transitionEffect;
		return (J) this;
	}

	/**
	 * Number or String Default 400
	 *
	 * @return
	 */
	public Integer getTransitionSpeed()
	{
		return transitionSpeed;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	/**
	 * Number or String Default 400
	 *
	 * @param transitionSpeed
	 *
	 * @return
	 */ public J setTransitionSpeed(Integer transitionSpeed)
	{
		this.transitionSpeed = transitionSpeed;
		return (J) this;
	}

	/**
	 * An array with grouped settings for the anchor
	 *
	 * @return
	 */
	public SmartWizardAnchorSettings getAnchorSettings()
	{
		if (anchorSettings == null)
		{
			anchorSettings = new SmartWizardAnchorSettings();
		}
		return anchorSettings;
	}

	/**
	 * An array with grouped settings for the anchor
	 *
	 * @param anchorSettings
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAnchorSettings(SmartWizardAnchorSettings anchorSettings)
	{
		this.anchorSettings = anchorSettings;
		return (J) this;
	}

	/**
	 * An array with language variables
	 *
	 * @return
	 */
	@NotNull
	public SmartWizardLangOptions getLang()
	{
		if (lang == null)
		{
			lang = new SmartWizardLangOptions();
		}
		return lang;
	}

	/**
	 * An array with language variables
	 *
	 * @param lang
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLang(SmartWizardLangOptions lang)
	{
		this.lang = lang;
		return (J) this;
	}

	/**
	 * An array with grouped settings for the toolbar
	 *
	 * @return
	 */
	@NotNull
	public SmartWizardToolbarSettings getToolbarSettings()
	{
		if (toolbarSettings == null)
		{
			toolbarSettings = new SmartWizardToolbarSettings();
		}
		return toolbarSettings;
	}

	/**
	 * An array with grouped settings for the toolbar
	 *
	 * @param toolbarSettings
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setToolbarSettings(SmartWizardToolbarSettings toolbarSettings)
	{
		this.toolbarSettings = toolbarSettings;
		return (J) this;
	}
}
