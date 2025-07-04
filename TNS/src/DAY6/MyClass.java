package DAY6;

public class MyClass {
	private int section;            //non-static var
	
	private static int srNo;          //static var
	
	
	//static block
	static
	{
		System.out.println("-----------------Within static block-------------");
		srNo=1000;
	}


	/**
	 * @param section
	 */
	//default constructor
	
	public MyClass(int section) {
		
		System.out.println("----Within Default Constructor-------");
		srNo++;
		section = 1;
		
	}


	@Override
	public String toString() {
	    return "MyClass [serial No=" + srNo + ", section=" + section + "]";
	}
	
	static void display() {
		System.out.println("Serial No : " +srNo );

	}
	

}
