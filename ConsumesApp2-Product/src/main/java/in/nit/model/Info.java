package in.nit.model;

public class Info {
 private String bcode;
 private String batchNum;
 private String lotNum;
public Info() {
	super();
}
public String getBcode() {
	return bcode;
}
public void setBcode(String bcode) {
	this.bcode = bcode;
}
public String getBatchNum() {
	return batchNum;
}
public void setBatchNum(String batchNum) {
	this.batchNum = batchNum;
}
public String getLotNum() {
	return lotNum;
}
public void setLotNum(String lotNum) {
	this.lotNum = lotNum;
}
@Override
public String toString() {
	return "Info [bcode=" + bcode + ", batchNum=" + batchNum + ", lotNum=" + lotNum + "]";
}
 
 
}
