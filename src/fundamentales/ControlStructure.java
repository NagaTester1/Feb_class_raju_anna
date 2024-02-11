package fundamentales;

public class ControlStructure {
	
	static int balance=100000;

	public void deposite(String accounttype, int depositeAmt) {
		
		switch(accounttype) {
		case "SAVING":
			if(depositeAmt <=200000) {
				balance +=depositeAmt;
			}else {
				System.out.println("Deposite Amount exceeded the daily limit 200000");
			}
			break;
		case "CURRENT":
			if(depositeAmt <=500000) {
				balance +=depositeAmt;
			}else {
				System.out.println("Deposite Amount exceeded the daily limit 500000");
			}
			break;
		case "RETAIL":
			if(depositeAmt <=300000) {
				balance +=depositeAmt;
			}else {
				System.out.println("Deposite Amount exceeded the daily limit 300000");
			}
			break;
		}
	}
	public void withdrawl(int withdrawlAmt) {
		if(withdrawlAmt<balance) {
		if(withdrawlAmt<50000) {
			balance-=withdrawlAmt;
		}else {
			System.out.println("Withdrawl amount daily limit 50000");
		}
		} else {
			System.out.println("Balance: "+balance);
		}
			
	}
	public static void checkbalances() {
		System.out.println("Balance: "+balance);
	}
	
	public static void main(String[] args) {
		
		ControlStructure cs=new ControlStructure();
		
		cs.deposite("CURRENT", 6000000);
		
		cs.deposite("SAVING",150000);
		ControlStructure.checkbalances();
		
		ControlStructure css=new ControlStructure();
		
		css.withdrawl(60000);
		css.withdrawl(30000);
		ControlStructure.checkbalances();
	}

}
