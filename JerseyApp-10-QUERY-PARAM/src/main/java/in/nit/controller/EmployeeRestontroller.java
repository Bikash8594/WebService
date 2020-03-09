package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/emp")
public class EmployeeRestontroller {
	
	@GET
	@Path("/mm")
	public String getEmployee(
			@QueryParam("eid")int eid,
			@QueryParam("ename")String ename,
			@QueryParam("branch")String branch)
	{
		return new StringBuilder("Employee :")
				.append("eid=").append(eid)
				.append(",ename=").append(ename)
				.append(",branch=").append(branch)
				.toString();

	}

}
