package in.nit.model;

public class Invoice {
	private int txid;
	private double billAmt;
	private double discount;
	private gst gs;
	public Invoice() {
		super();
	}
	public int getTxid() {
		return txid;
	}
	public void setTxid(int txid) {
		this.txid = txid;
	}
	public double getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public gst getGs() {
		return gs;
	}
	public void setGs(gst gs) {
		this.gs = gs;
	}
	@Override
	public String toString() {
		return "Invoice [txid=" + txid + ", billAmt=" + billAmt + ", discount=" + discount + ", gs=" + gs + "]";
	}
	
	

}
