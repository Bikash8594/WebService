package in.nit.dao;

import java.util.List;

import in.nit.model.Product;

public interface IProductDao {
	public int saveProduct(Product p);
	public List<Product>getAllProducts();

}
