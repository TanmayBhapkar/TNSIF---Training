package DAY11.multiplecatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	
	public static void divide()
	{
		short a,b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number: ");
		
		
	
	try
	{
		a = sc.nextShort();
		b = sc.nextShort();
		
		c = a/b;
		System.out.println("Division is :"+c);
	}
	
	catch(InputMismatchException e)
	{
		System.err.println(e.getMessage());
	}
	catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
	{
		System.err.println(e.getMessage());

	}
	catch(Exception e)
	{
		System.err.println(e.getMessage());
	}
	finally
	{
		System.out.println("Finally block ");
	}

}
	
}