package DAY8.SingleDimension;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get the array
		int intArr[] = {69, 20, 12, 40, 54, 35};
		
		System.out.println(Arrays.toString(intArr));
		for(int i=0; i<intArr.length; i++)
		{
			System.out.println(intArr[i]+"");
			
		}
		
		System.out.println();
		
		//sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//binary search
		System.out.println(Arrays.binarySearch(intArr, 9));
		
		//compare
		System.out.println(Arrays.toString(intArr));
		
		
		int intArr1[] = {69, 52,73,21,05};
		//compare both the arrayn
		if(Arrays.compare(intArr, intArr1)==0)
		{
			System.out.println("Both the arrays are sorted");

		}
		else {
			System.out.println("Both the arrays are not sorted");

		}
		
		//copy
		int intArr2[] = Arrays.copyOf(intArr1, 2);
		System.out.println(Arrays.toString(intArr2));
		
		
		int intArr3[] = Arrays.copyOfRange(intArr1, 2, 4);
		System.out.println(Arrays.toString(intArr3));
		
		
		//fill method
		Arrays.fill(intArr3, 7);
		System.out.println(Arrays.toString(intArr3));


		
		

		
		
		

	}

}
