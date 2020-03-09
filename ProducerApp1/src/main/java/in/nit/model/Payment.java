package in.nit.model;

public class Payment {
	private int pid;
	private String pcode;
	private double  pamt;
	public Payment() {
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
	@Override
	public String toString() {
		return "Payment [pid=" + pid + ", pcode=" + pcode + ", pamt=" + pamt + "]";
	}
	

}
