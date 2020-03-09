package in.nit.controller;

import java.util.DoubleSummaryStatistics;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/oper")
public class MathOperController {
	
	@GET
	public String findMaxMin(
			@QueryParam("numa")int a,
			@QueryParam("numb")int b,
			@QueryParam("numc")int c) {
		/*
		 * int max=a>b?(a>c?a:c):(b>c?b:c); int min=a<b?(a<c?a:c):(b<c?b:c);
		 */
	/*	int max=Math.max(Math.max(a, b),  c);
		int min=Math.min(Math.min(a, b),  c);
		*/
		
		
		DoubleSummaryStatistics ds=new DoubleSummaryStatistics();
		ds.accept(a);ds.accept(b);ds.accept(c);
		
		double max=ds.getMax();
		double min=ds.getMin();
		
		return new StringBuilder().append("Result is :")
				.append("Min="+ min)
				.append("Max="+ max).toString();
	
	}
	}
		
	
	

