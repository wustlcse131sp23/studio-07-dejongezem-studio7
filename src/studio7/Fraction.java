package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction()
	{
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction(int theNumerator, int theDenominator) {
		this.numerator = theNumerator;
		this.denominator = theDenominator; 
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public int gcd() {
		
		if (this.numerator % this.denominator == 0)
		{
			return this.denominator;
		}
		else
		{
			Fraction f = new Fraction(this.denominator, this.numerator % this.denominator);
			return f.gcd();
		}
	}
	
	public Fraction add(Fraction f1)
	{
		// f.add(1/2);
		// ad + bc / bd, a/b c/d
		// a = this.numerator, b = this.denominator, c = f1.numerator 
		Fraction f2 = new Fraction();
		f2.setNumerator(this.numerator * f1.denominator + this.denominator * f1.numerator);
		f2.setDenominator(this.denominator * f1.denominator);
		return f2;
	}
	
	public Fraction multiply(Fraction f1)
	{
		Fraction f2 = new Fraction();
		f2.setNumerator(this.numerator * f1.numerator);
		f2.setDenominator(this.denominator * f1.denominator);
		return f2;
	}
	
	public Fraction reciprocal()
	{
		Fraction f1 = new Fraction();
		f1.setNumerator(this.denominator);
		f1.setDenominator(this.numerator);
		return f1;
	}
	
	public Fraction simplify()
	{
		if (this.gcd() == 1)
		{
			return this;
		}
		
		else 
		{
			Fraction f1 = new Fraction(this.numerator/this.gcd(), this.denominator/this.gcd());
			return f1;
		}
	}
}
