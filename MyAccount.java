package assignment1;

public class MyAccount implements Account{
    private int balance = 0;
       
    @Override
	public int getBalance() {
		return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }

	@Override
	public int debit(int amount) {
		balance -= amount;
        return balance;
	}

	@Override
	public int credit(int amount) {
        balance += amount; 
        return balance;	
    }

    
}
