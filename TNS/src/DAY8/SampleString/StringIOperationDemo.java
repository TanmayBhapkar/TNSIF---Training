package DAY8.SampleString;

public class StringIOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			String s1 = new String (" Indian ");
			
			System.out.println(s1);
			String s2 = s1.toUpperCase();
			System.out.println(s2);
			System.out.println(s1.length());
			int a = s2.length();
			
			String s3 = s1.substring(1,7);
			System.out.println(s3);
			
			System.out.println(s1.trim());
			//System.out.println(s1.trim());

			System.out.println(s1.isEmpty());
			
			s2 = new String(s1);
			System.out.println("case 1 :"+ s1.equals(s2));
			System.out.println("case 2 :" + s1==s2);






		

	}

}
