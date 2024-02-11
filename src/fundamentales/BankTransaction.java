package fundamentales;

public class BankTransaction {

	static int balance =100000;
	public void deposit(int depositeAmt) {
		balance +=depositeAmt; //balance =balance+despositeAmt
		
	}
	public void withdrawl(int withdrawlAmt) {
		balance -=withdrawlAmt;//balance =balance-withdrawlAmt
	}
	
	public static void checkbalance() {
		System.out.println("Balance: "+balance);
	}
	public static void main(String[] args) {
		
		BankTransaction bank=new BankTransaction();
		
		bank.deposit(30000);
		BankTransaction.checkbalance();
		
		BankTransaction newbank=new BankTransaction();
		newbank.withdrawl(20000);
		BankTransaction.checkbalance();
	}

}
