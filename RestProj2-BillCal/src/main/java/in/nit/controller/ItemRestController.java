package in.nit.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.nit.model.BillInfo;
import in.nit.model.ItemDetail;

@Path("/item")
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public class ItemRestController {
	
	@POST
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})

     public BillInfo bill(ItemDetail d) {
    	 double cost=d.getCost();
    	 float qty=d.getQty();
    	 double discount=cost*5/100.0;
		double mrp= qty*(cost-discount);
		
		
		BillInfo b=new BillInfo();
		
		
		b.setPurchaseId(d.getTxid());
		b.setCode("12365");
		b.setCost(cost);
		b.setDiscount(discount);
		b.setMrp(mrp);
		b.setQty(qty);
		return b;
		
	
    	 
     }
}
