package DAY7.overriding;

public class OverRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;
		
		//Dynamic binding assigning child object to parent class reference varaibles;
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
	}

}
