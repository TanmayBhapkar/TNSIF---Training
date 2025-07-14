package DAY12.multithreading;

public class Childdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildThread c = new ChildThread(10, "Hello");
		c.start();
//		c1.start();
     	System.out.println("End of the program");

	}

}
