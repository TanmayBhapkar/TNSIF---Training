package DAY8.Abstraction;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s;
		s = new Square ();
		s.calArea();
		s.show();
		
		
		s = new Rectangular ();
		s.calArea();
		s.show();
		
		s = new Square (22);
		s.calArea();
		s.show();
		
		s = new Rectangular (11, 34);
		s.calArea();
		s.show();


	}

}
