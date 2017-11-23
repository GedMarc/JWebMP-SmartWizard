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
package za.co.mmagon.jwebswing.plugins.angularfileupload;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class SmartWizardFeature extends Feature<SmartWizardOptions, SmartWizardFeature> implements SmartWizardFeatures, GlobalFeatures
{
	
	private static final long serialVersionUID = 1L;
	
	private SmartWizardOptions options;
	
	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public SmartWizardFeature(Component forComponent)
	{
		super("SmartWizard");
		setComponent(forComponent);
	}
	
	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public SmartWizardOptions getOptions()
	{
		if (options == null)
		{
			options = new SmartWizardOptions();
		}
		return options;
	}
	
	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "smartWizard(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
		
		addQuery(getComponent().getJQueryID() + "on(\"leaveStep\", function(e, anchorObject, stepNumber, stepDirection) {\n" +
				         "                var elmForm = $(\"#form-step-\" + stepNumber);\n" +
				         "                // stepDirection === 'forward' :- this condition allows to do the form validation \n" +
				         "                // only on forward navigation, that makes easy navigation on backwards still do the validation when going next\n" +
				         "                if(stepDirection === 'forward' && elmForm){\n" +
				         "                    elmForm.validator('validate'); \n" +
				         "                    var elmErr = elmForm.children('.has-error');\n" +
				         "                    if(elmErr && elmErr.length > 0){\n" +
				         "                        // Form validation failed\n" +
				         "                        return false;    \n" +
				         "                    }\n" +
				         "                }\n" +
				         "                return true;\n" +
				         "            });");
		
		addQuery(getComponent().getJQueryID() + "on(\"showStep\", function(e, anchorObject, stepNumber, stepDirection) {\n" +
				         "                // Enable finish button only on last step\n" +
				         "                if(stepNumber == " + (getComponent().getChildren().size() - 1) + "){ \n" +
				         "                    $('.btn-finish').removeClass('disabled');  \n" +
				         "                }else{\n" +
				         "                    $('.btn-finish').addClass('disabled');\n" +
				         "                }\n" +
				         "            });");
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return this == obj || obj != null && getClass() == obj.getClass() && super.equals(obj);
	}
	
	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 79 * hash + (this.getID().hashCode());
		return hash;
	}
}
