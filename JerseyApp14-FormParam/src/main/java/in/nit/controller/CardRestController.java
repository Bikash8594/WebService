package in.nit.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/card")
public class CardRestController {
	@POST
	@Path("/pay")
	public String doPayment(
			@FormParam("cname")String CustomName,
			@FormParam("cnum")String CardNum,
			@FormParam("cvv")int cvv,
			@FormParam("amt") double amt,
			@FormParam("dte") String  txDte) {
		return new StringBuilder()
				.append("Name :").append(CustomName)
				.append(",Number :").append(CardNum)
				.append(",cvv :").append(cvv)
				.append(",amt :").append(amt)
				.append(",date:").append(txDte)
				.toString();
	}

}
