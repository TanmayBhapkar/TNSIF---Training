package DAY8.Interface;

public class Customer {
	private String name;
	private String city;
	public String getName ()
	{
		return name;
	
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity ()
	{
		return city;
	
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param name
	 * @param city
	 */
	public Customer(String name, String city) {
		this.name = name;
		this.city = city;
	}
	/**
	 * 
	 */
	public Customer() {
		super();
	}
	
	
	
	

}
