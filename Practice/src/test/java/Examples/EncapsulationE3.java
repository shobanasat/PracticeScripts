package Examples;

public class EncapsulationE3 {
	
	private long acctno;
	private String name,email;
	private float amount;
	
	public long getAcctno() {
		return acctno;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public float getAmount() {
		return amount;
	}
	
	public void setAcctno(long newAcctno) {
		this.acctno = newAcctno;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
	public void setAmount(float newAmount) {
		this.amount = newAmount;
	}
}
