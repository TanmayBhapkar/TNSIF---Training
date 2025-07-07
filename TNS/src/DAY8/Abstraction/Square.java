package DAY8.Abstraction;

public class Square extends Shape {
	
	float side;
	
	public Square()
	{
		side = 2.0f;
		
	}

	/**
	 * @param side
	 */
	public Square(float side) {
		this.side = side;
	}

	@Override
	public void calArea() {
		this.area=side*side;
	}
	
	
	

}
