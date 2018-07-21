package com.jwebmp.plugins.smartwizard.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

public class SmartWizardLangOptions
		extends JavaScriptPart
{
	/**
	 * The next value
	 */
	private String next;
	/**
	 * The previous text
	 */
	private String previous;

	/**
	 * Sets the lang options
	 *
	 * @param next
	 * @param previous
	 */
	public SmartWizardLangOptions(String next, String previous)
	{
		this.next = next;
		this.previous = previous;
	}

	/**
	 * An empty lang options object
	 */
	public SmartWizardLangOptions()
	{
		//Nothing needed
	}

	/**
	 * the next text
	 *
	 * @return
	 */
	public String getNext()
	{
		return next;
	}

	/**
	 * The next text
	 *
	 * @param next
	 *
	 * @return
	 */
	public SmartWizardLangOptions setNext(String next)
	{
		this.next = next;
		return this;
	}

	/**
	 * THe previous text
	 *
	 * @return
	 */
	public String getPrevious()
	{
		return previous;
	}

	/**
	 * Sets the previous text
	 *
	 * @param previous
	 *
	 * @return
	 */
	public SmartWizardLangOptions setPrevious(String previous)
	{
		this.previous = previous;
		return this;
	}
}
