package DAY7.overloading;

public class OverLoadingDemo {
	public static void main(String[] args)
	{
		Point p=new Point();
		System.out.println(p);
		
		Point p1=new Point (20.09f, 23.4f);
		System.out.println(p1);
		
		System.out.println("--------------Method OverLoading-----------------");
		System.out.println(MethodOverLoading.addition(3.14f, 23.67f));
		System.out.println(MethodOverLoading.addition(1, 2, 3));

		
	}

}
