package in.nit.model;

public class Customber {
	private int cid;
	private String cname;
	private float bill;
	private Address addrs;
	public Customber() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}
	public Address getAddrs() {
		return addrs;
	}
	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "Customber [cid=" + cid + ", cname=" + cname + ", bill=" + bill + ", addrs=" + addrs + "]";
	}


}
