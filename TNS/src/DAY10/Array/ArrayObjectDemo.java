package DAY10.Array;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student [] arr;
		
		//declared memory for 5 object on type students
		
		arr=new Student[5];
		
		arr[0] = new Student(101, "Heti");
		arr[1] = new Student(102, "Zeel");
		arr[2] = new Student(103, "Aditya");
		arr[3] = new Student(104, "Rahul");
		arr[4] = new Student(105, "Akash");
	//	arr[5] = new Student(106, "Hitesh");
		
		for(int i=0; i<=arr.length;i++)
		{
			System.out.println("Elements at"+ i+": " +arr[i].getRollNo() + " " +arr[i].getName());
		}




		

	}

}
