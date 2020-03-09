package in.nit.model;

import java.util.List;
import java.util.Map;

public class Product {
	private int pid;
	private String pcode;
	private double pamt;
	private Info nob;
	private List<String> models;
	private Map<String,String> design;
	
	public Product() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public double getPamt() {
		return pamt;
	}
	public void setPamt(double pamt) {
		this.pamt = pamt;
	}
	public Info getNob() {
		return nob;
	}
	public void setNob(Info nob) {
		this.nob = nob;
	}
	public List<String> getModels() {
		return models;
	}
	public void setModels(List<String> models) {
		this.models = models;
	}
	public Map<String, String> getDesign() {
		return design;
	}
	public void setDesign(Map<String, String> design) {
		this.design = design;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcode=" + pcode + ", pamt=" + pamt + ", nob=" + nob + ", models=" + models
				+ ", design=" + design + "]";
	}
	
	

}
