package in.nit.model;

public class Student {
	private Integer sid;
	private String sname;
	private Double sfee;
	private String course;
	private Double discount;
	public Student() {
		super();
	}

	public Student(Integer sid, String sname, Double sfee, String course, Double discount) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.course = course;
		this.discount = discount;
	}

	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Double getSfee() {
		return sfee;
	}
	public void setSfee(Double sfee) {
		this.sfee = sfee;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", course=" + course + ", discount="
				+ discount + "]";
	}


}
