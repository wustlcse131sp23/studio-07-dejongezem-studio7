package studio7;

public class Complex {

	//instance
	private double a;
	private double b;
	
	//constructor
	public Complex()
	{
		a = 0.0;
		b= 0.0;
	}
	public Complex( double theA,  double theB)
	{
		this.a = theA;
		this.b = theB;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public Complex add(Complex c1)
	{
		Complex sum = new Complex();
		sum.setA(this.a + c1.a);
		sum.setB(this.b+ c1.b);
		return sum;
	}
	public Complex multiply(Complex c1)
	{
		Complex product = new Complex();
		product.setA(this.a*c1.a - this.b*c1.b);
		product.setB(this.a * c1.b + this.b * c1.a);
		return product;
		
	}
}