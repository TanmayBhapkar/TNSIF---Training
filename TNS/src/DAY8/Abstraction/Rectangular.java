package DAY8.Abstraction;

public class Rectangular extends Shape{
	float width;
	float height;
	/**
	 * 
	 */
	
	//unparameterized costructor
	public Rectangular() {
		width = 3.2f;
		height = 2.0f;
		
	}
	/**
	 * @param width
	 * @param height
	 */
	//parameterized constructor
	public Rectangular(float width, float height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void calArea() {
		this.area=height*width;
	}
	
	

}
