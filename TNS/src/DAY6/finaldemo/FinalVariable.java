package DAY6.finaldemo;

public class FinalVariable {
	//FINALnt a; //final instance var 
	final int x = 100;
	//declare stsatic blank var
	final static int y ;
	
	final static int z = 10;
	
	//instance method
	void change()
	{
		//x = 30;
		//= 20;
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", y= "+ y +"]";
	}
	
	static {
		y = 20;
		
	}
}
