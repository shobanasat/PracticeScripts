package Examples;

public class EncapsulationE3Main {

	public static void main(String[] args) {

		EncapsulationE3 e3 = new EncapsulationE3();
		e3.setAcctno(63245834L);
		e3.setName("Shobana");
		e3.setEmail("shobanasathyanathan@gmail.com");
		e3.setAmount(6476.75f);
		
		System.out.println("Account Number is: " + e3.getAcctno());
		System.out.println("Name is: " + e3.getName());
		System.out.println("Email ID is: " + e3.getEmail());
		System.out.println("Amount is: " + e3.getAmount());
	}

}
