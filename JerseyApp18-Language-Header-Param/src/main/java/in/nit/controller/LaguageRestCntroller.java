package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

@Path("/code")
public class LaguageRestCntroller {
	
	@GET
	public String getLanguage(
			@HeaderParam("language")String lang) {
		int count=1;
		String []languageCode=lang.split(",");
		for(String s:languageCode) {
			System.out.println(count+ ":"+s);
			count++;
		}
		return lang;
		
	}

}
