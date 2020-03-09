package in.nit.model;

public class Customber {
	private int cid;
	private String code;
	private String cAddrs;
	private Invoice iv;
	public Customber() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getcAddrs() {
		return cAddrs;
	}
	public void setcAddrs(String cAddrs) {
		this.cAddrs = cAddrs;
	}
	public Invoice getIv() {
		return iv;
	}
	public void setIv(Invoice iv) {
		this.iv = iv;
	}
	@Override
	public String toString() {
		return "Customber [cid=" + cid + ", code=" + code + ", cAddrs=" + cAddrs + ", iv=" + iv + "]";
	}
	
	

}
