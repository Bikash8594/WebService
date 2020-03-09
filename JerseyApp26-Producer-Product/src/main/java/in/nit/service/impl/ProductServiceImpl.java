
package in.nit.service.impl;

import java.util.Collection;
import java.util.List;

import javax.inject.Inject;


import in.nit.dao.IProductDao;
import in.nit.model.Product;
import in.nit.service.IProductService;

public class ProductServiceImpl 
	implements IProductService
{
	@Inject
	private IProductDao dao;
	
	public int saveProduct(Product p) {
		//read product prodCost
		double  cost=p.getProdCost();
		//calculate discount,gst
		double discount=cost*8/100.0;
		double gst=cost*18/100.0;
		
		//set details back to Model object
		p.setProdDisc(discount);
		p.setProdGst(gst);

		//call DAO
		return dao.saveProduct(p);
	}

	public List<Product> getAllProducts() {
		List<Product> list=dao.getAllProducts();

		return list;
	}
}







