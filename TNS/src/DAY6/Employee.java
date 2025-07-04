package DAY6;

public class Employee {
	private String name;
	private int id;
	
	//declare static ompANY nAME
	static String companyname = "TNSIF";

	/**
	 * @param name
	 * @param id
	 */
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", + Company = "+ companyname +"]";
	}
	
	
			

}
