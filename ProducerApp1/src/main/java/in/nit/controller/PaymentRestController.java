package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.nit.model.Payment;

@Path("/payment")
public class PaymentRestController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Payment showInfo() {
		Payment p=new Payment();
		p.setPid(1);p.setPcode("hghj5");p.setPamt(22.0);
		return p;
		
	}
	

}
