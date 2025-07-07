package DAY7.overriding;

public class Colour {
	protected Colour getColour()
	{
		Colour s = new Colour();
		return s;
		
	}

}
//Child class
class Red extends Colour{
	protected Colour getColour()
	{
		Red s = new Red();
		return s;
		
	}
}

//Child class
class Blue extends Colour{
	protected Colour getColour()
	{
		Blue s = new Blue();
		return s;
		
	}
}