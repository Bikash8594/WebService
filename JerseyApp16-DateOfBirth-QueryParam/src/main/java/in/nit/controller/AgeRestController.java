package in.nit.controller;

import java.time.LocalDate;
import java.time.Period;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/m")
public class AgeRestController {
	
	@GET
	public String  findAge(
			@QueryParam("year") int year,
			@QueryParam("month") int month,
			@QueryParam("day") int day
			) {
		
	LocalDate previousDate=LocalDate.of(year, month, day);
	LocalDate presentDate=LocalDate.now();
	
	Period diff= Period.between(previousDate,presentDate);
	return diff.getYears()+"year" +diff.getMonths()+"month"+diff.getDays()+"day";
		
			
		
	
	}

}
