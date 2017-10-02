package za.co.mmagon.jwebswing.plugins.angularfileupload.options.functions;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavascriptFunction;

public class SmartWizardCancelFunction extends JavascriptFunction
{
	@Override
	public String renderFunction()
	{
		return "\t\t\t$('<button></button>').text('Cancel')\n" +
				"\t\t\t\t\t      .addClass('btn btn-danger')\n" +
				"\t\t\t\t\t      .on('click', function(){ \n" +
				"\t\t\t\t\t\talert('Cancel button click');                            \n" +
				"\t\t\t\t\t      })";
	}
}
