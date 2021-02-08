package exception;
public class Account {
	private String account;
	private double balance;
	private double interestRate;
	
	public Account(){}
	public Account(String account, double balance, double interestRate){
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	@Override
	public String toString() {
		return "계좌정보: "+account+" 잔액 : "+balance+" 이자율 : "
				+interestRate*100+"%";
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest(){
		return balance * interestRate;
	}
	public void deposit(double money)throws Exception{
		if(money < 0) throw new Exception("입금 금액이 0보다 작습니다.");
		else balance += money;
	}
	public void withdraw(double money)throws Exception{
		if(money < 0 || money > balance)
			throw new Exception("출금 금액이 0보다 적거나 현재 잔액보다 많습니다.");
		else balance -= money;
	}
}
