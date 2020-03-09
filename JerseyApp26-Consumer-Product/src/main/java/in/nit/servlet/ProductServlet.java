package in.nit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nit.controller.ProductRestConsumer;
import in.nit.model.Product;
@WebServlet("/save")
public class ProductServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //read form data
	String pid=req.getParameter("pid");
	String pcode=req.getParameter("pcode");
	String pcost=req.getParameter("pcost");
	//parse 
	int prodId=Integer.parseInt(pid);
	Double prodCost=Double.parseDouble(pcost);
	//create model cls obj and set data
	Product p=new Product();
	p.setProdId(prodId);
	p.setProdCode(pcode);
	p.setProdCost(prodCost);
	
	//call consumer code
	 String entity=ProductRestConsumer.saveProduct(p);
	 //send to ui
	 req.setAttribute("message",entity);
	 //Dispact to jsp
	 RequestDispatcher rd=req.getRequestDispatcher("product.jsp");
	 rd.forward(req, resp);
	
	}
}
