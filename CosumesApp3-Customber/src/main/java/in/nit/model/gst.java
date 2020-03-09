package in.nit.model;

public class gst {
	private int cgst;
	private double sgst;
	public gst() {
		super();
	}
	public int getCgst() {
		return cgst;
	}
	public void setCgst(int cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	@Override
	public String toString() {
		return "gst [cgst=" + cgst + ", sgst=" + sgst + "]";
	}
	

}
