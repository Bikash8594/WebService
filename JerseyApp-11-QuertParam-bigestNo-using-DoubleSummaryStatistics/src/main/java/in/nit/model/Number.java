
package in.nit.model;
public class Number {
	private int numa;
	private int numb;
	private int numc;
	public Number() {
		super();
	}
	public int getNuma() {
		return numa;
	}
	public void setNuma(int numa) {
		this.numa = numa;
	}
	public int getNumb() {
		return numb;
	}
	public void setNumb(int numb) {
		this.numb = numb;
	}
	public int getNumc() {
		return numc;
	}
	public void setNumc(int numc) {
		this.numc = numc;
	}
	@Override
	public String toString() {
		return "Number [numa=" + numa + ", numb=" + numb + ", numc=" + numc + "]";
	}
	

}
