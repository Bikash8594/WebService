package in.nit.model;

public class ItemDetail {
	private int txid;
	private String code;
	private double cost;
	private float qty;
	public ItemDetail() {
		super();
	}
	public int getTxid() {
		return txid;
	}
	public void setTxid(int txid) {
		this.txid = txid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public float getQty() {
		return qty;
	}
	public void setQty(float qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "ItemDetail [txid=" + txid + ", code=" + code + ", cost=" + cost + ", qty=" + qty + "]";
	}

}
