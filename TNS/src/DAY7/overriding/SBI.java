package DAY7.overriding;

public class SBI extends RBI {
	
	//@override
	public float getRateOfInterest ()
	{
		System.out.println("Base rate of interest ");

		return 7.0f;
	}

}
