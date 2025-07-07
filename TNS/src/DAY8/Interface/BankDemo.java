package DAY8.Interface;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s1 = new SavingAccount("", null, 0, 0);
		
		s1.deposit(23373);
		System.out.println(s1);
		
		s1.withdraw(233443);
		System.out.println(s1);
		

	}

}
