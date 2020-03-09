package in.nit.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
	private int pid;
	private String pcode;
	private double pcost;
	public Product() {
		super();
	}
	public Product(int pid, String pcode, double pcost) {
		super();
		this.pid = pid;
		this.pcode = pcode;
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcode=" + pcode + ", pcost=" + pcost + "]";
	}
	
	
}
