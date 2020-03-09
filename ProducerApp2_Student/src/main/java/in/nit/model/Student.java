package in.nit.model;

import java.util.List;
import java.util.Map;

public class Student {
	private int sid;
	private String sname;
	private double sfee;
	private List<String>subject;
	private Map<String,Integer> mark;
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public Map<String, Integer> getMark() {
		return mark;
	}
	public void setMark(Map<String, Integer> mark) {
		this.mark = mark;
	}
	

}
