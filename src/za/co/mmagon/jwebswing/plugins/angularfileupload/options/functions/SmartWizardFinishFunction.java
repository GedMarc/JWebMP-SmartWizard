package za.co.mmagon.jwebswing.plugins.angularfileupload.options.functions;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavascriptFunction;

public class SmartWizardFinishFunction extends JavascriptFunction
{
	@Override
	public String renderFunction()
	{
		
		return "\t\t\t$('<button></button>').text('Finish')\n" +
				"\t\t\t\t\t      .addClass('btn btn-info')\n" +
				"\t\t\t\t\t      .on('click', function(){ \n" +
				
				"\t\t\t\t\t\talert('Finsih button click');                            \n" +
				
				
				"\t\t\t\t\t      })";
	}
}
