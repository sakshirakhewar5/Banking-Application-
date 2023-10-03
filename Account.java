package bb;

public class Account {
	private int accountId;
	private static double balance;
	
	
	void deposite(int amt){
		if(amt>0) {
			double amount=balance+=amt;
		}
	}
	void withdraw(double amt) {
		if(balance>500) {
			boolean check = false;
			if(check) {
				balance=balance - amt;
				System.out.println("Remaning Balance="+balance);
			}else {
				System.out.println("Insufficent Balance");
			}
		}
	}
}
