package DAY10.Array;

public class MLArray {
	
	public static void printArray(int c[] []) {
		System.out.println("Array of elements are as follows");
		
		for(int i=0; i<=c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.println();
				
			}
		}
	}
	
	public class MultiDimensionArray{
		public static void main(String[] args)
		{
			int c[] [] = {  {12,34}, {10,20}, {1,2}, {78,87}};
			System.out.println("Number of rows in C array: "+c.length);
			
			MLArray.printArray(c);
		}
		
	}

}






