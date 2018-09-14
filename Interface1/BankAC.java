
public class BankAC implements Measure{
	public int balance;
	BankAC(int balance){
		this.balance=balance;
	}
	
	@Override
	public int getvalue() {
		// TODO Auto-generated method stub
		return balance;
	}
}
