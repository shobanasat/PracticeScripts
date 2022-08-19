package Exceptions;

public class UserDefinedException extends Exception {
	
	static int acct_no[] = {1000,1001,1002,1003};
	static String name[] = {"Shobana","Jishnu","Isha","Riyan"};
	static Double bal[] = {1000.01,2000.54,6546.76,7658.98};
	
	UserDefinedException(){
		
	}
	
	UserDefinedException(String str){
		super(str);
	}

	public static void main(String[] args) {
		try {
			for (int i = 0;i<4;i++) {
				System.out.println(acct_no[i] + "," + name[i] + "," + bal[i] );
			
			if(bal[i] <2000) {
				UserDefinedException ude = new UserDefinedException("Balance less than 2000");
				throw ude;
			}}
		}
		catch(UserDefinedException e) {
			System.out.println(e.getMessage());
			
		}

	}

}
