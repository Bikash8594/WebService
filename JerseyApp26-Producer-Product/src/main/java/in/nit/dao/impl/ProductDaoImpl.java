package in.nit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.nit.context.DbContext;
import in.nit.dao.IProductDao;
import in.nit.model.Product;

public class ProductDaoImpl implements IProductDao {
	public int saveProduct(Product p) {
		String SQL="INSERT INTO PRODTAB VALUES (?,?,?,?,?)";
		int count=0;
		try {
			Connection con=DbContext.getCon();
			PreparedStatement ps=con.prepareStatement(SQL);
			//convert model to prepareStatement
			ps.setInt(1, p.getProdId());
			ps.setString(2, p.getProdCode());
			ps.setDouble(3,p.getProdCost());
			ps.setDouble(4, p.getProdDisc());
			ps.setDouble(5, p.getProdGst());

			//execute sql
			count=ps.executeUpdate();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	public List<Product> getAllProducts() {  
		String sql="SELECT * FROM PRODTAB"; 
		List<Product> list=null; 
		try {    
			Connection con=DbContext.getCon(); 
			PreparedStatement ps=con.prepareStatement(sql); 
	

	ResultSet rs=ps.executeQuery(); 
	list=new ArrayList<Product>();  
	while(rs.next()) {  
		//one row -> one object    
		Product p=new Product(    
				rs.getInt("prodId"),   
				rs.getString("prodCode"), 
				rs.getDouble("prodCost"),   
				rs.getDouble("prodDisc"),
				rs.getDouble("prodGst"));   
		//add one object to List  
		list.add(p); 
	 } 
	 
	  } catch (Exception e) {  
		  e.printStackTrace(); 
		  } 
	  return list;
		  } 
	 
	} 

	