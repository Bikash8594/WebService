package in.nit.model;


public class Customber {
	private int cid;
	private String cname;
	private String type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Customber [cid=" + cid + ", cname=" + cname + ", type=" + type + "]";
	}
	

}
