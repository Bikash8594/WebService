package in.nit.model;

public class BillInfo {
	private int purchaseId;
	private String code;
	private double cost;
	private float qty;
	private double discount;
	private double mrp;
	public BillInfo() {
		super();
	}
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
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
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	@Override
	public String toString() {
		return "BillInfo [purchaseId=" + purchaseId + ", code=" + code + ", cost=" + cost + ", qty=" + qty
				+ ", discount=" + discount + ", mrp=" + mrp + "]";
	}


	

}
