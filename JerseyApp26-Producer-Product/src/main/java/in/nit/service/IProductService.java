package in.nit.service;

import java.util.List;

import in.nit.model.Product;

public interface IProductService {
	public int saveProduct(Product p);
	public List<Product>getAllProducts();

}
