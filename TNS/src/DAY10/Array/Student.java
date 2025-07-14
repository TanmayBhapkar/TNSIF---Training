package DAY10.Array;

public class Student {
	
	private int rollNo;
	private String name;

	// ✅ Constructor to initialize values
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	// Getters and Setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
