package in.nit.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private int eid;
	private String ename;
	private double basicSal;
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", basicSal=" + basicSal + "]";
	}
	

}
