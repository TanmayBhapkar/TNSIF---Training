package DAY6.finaldemo;

final class FinalClass{
	
	void show ()
	{
		System.out.println("Final class cannot be inherited");
	}
}


//class Student extends FinalClass{
//	
//}


public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass f = new FinalClass();
		f.show();

	}

}
