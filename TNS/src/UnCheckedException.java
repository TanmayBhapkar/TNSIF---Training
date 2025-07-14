
public class UnCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[];
		try {
			x = new int [] {1,2,3,4,5,6};
			System.out.println(x[2]);
			System.out.println(x[9]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Specified index does not exist" +e.getMessage());
		}

	}

}
