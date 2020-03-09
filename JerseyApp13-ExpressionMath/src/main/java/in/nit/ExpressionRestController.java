package in.nit;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/exp")
public class ExpressionRestController {

	@GET
	public String getEval(
			@QueryParam("input") String input) {
		String result=null;
		try {
			ScriptEngineManager sem=new ScriptEngineManager();

			ScriptEngine se=sem.getEngineByName("javascript");
			Object ob=se.eval(input);
			result =ob.toString();
		} catch (Exception e) {
			result="Invalid Expression";
			e.printStackTrace();
		}
		return result;
	}
}
