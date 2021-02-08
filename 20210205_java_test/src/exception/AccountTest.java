package exception;
public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account("441-0290-1203",500000,0.073);
		System.out.println(account);
		try{
			account.deposit(-1000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		try{
			//account.withdraw(-500);
			account.withdraw(100000000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("현재 이자 : "+account.calculateInterest());
	}
}
