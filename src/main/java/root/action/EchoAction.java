package root.action;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import root.form.EchoForm;

public class EchoAction {
//	@Resource
	@ActionForm
	public EchoForm echoForm;

	@Execute(validator=false)
	public String index(){
		return "input.jsp";
	}
//echo
	@Execute(validator=false)
	public String echo(){
		return "echo.jsp";
	}
}
