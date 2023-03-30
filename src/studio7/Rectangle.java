package studio7;

public class Rectangle {

	// instance variables
	
	private double length;
	private double width;
	
	// constructors
	
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	/**
	 * returns area of rectangle
	 * @return length * width;
	 */
	public double area() {
		return length * width;
	}
	
	/**
	 * returns perimeter of rectangle
	 * @return 2 * length + 2 * width
	 */
	public double perimeter() {
		return 2 * length + 2 * width;
	}
	
	/**
	 * returns true if the rectangle is a square
	 * @return true if length == width, false otherwise
	 */
	public boolean isSquare () {
		if (length == width)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	/**
	 * returns true if r1 has a greater area than r2
	 * @param r1 the first rectangle
	 * @param r2 the second rectangle
	 * @return true if r1.area() > r2.area(), false otherwise
	 */
	public boolean largerThan(Rectangle r1, Rectangle r2) {
		if (r1.area() > r2.area())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
