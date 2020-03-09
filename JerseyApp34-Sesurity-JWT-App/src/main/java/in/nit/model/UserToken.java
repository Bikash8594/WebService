package in.nit.model;

public class UserToken {
	private String status;  
	private String token;
	public UserToken(String status, String token) {
		super();
		this.status = status;
		this.token = token;
	}
	public UserToken() {
		super();
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "UserToken [status=" + status + ", token=" + token + "]";
	} 

}
