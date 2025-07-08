package DAY8.SampleString;

public class SampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c[] = {'I','N','D','I','A'};
		
		String s1 = new String(c);
		System.out.println(s1);
		
		String s2 = new String(s1);
		System.out.println(s2);
		
		String longstr="This is to show" + "how long sentences " + "can be printed";
		System.out.println(longstr);

	}

}
