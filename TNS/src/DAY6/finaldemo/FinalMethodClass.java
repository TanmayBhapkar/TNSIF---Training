package DAY6.finaldemo;

public class FinalMethodClass {

	/**
	 * 
	 */
	//constructor

	public FinalMethodClass() 
	{
		System.out.println("This is default constructor");
		
	}
	
	final int a = 50;
	
	final void show()
	{
		System.out.println("value of a = "+ a);
	}
	
}
