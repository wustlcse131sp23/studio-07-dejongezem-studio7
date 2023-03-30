package studio7;

public class Die {
	//instance var
	
	private int n;
	
	//constructor
	public Die(int initN)
	{
		n=initN;
	}
	/**
	 * returns random int value from 1 to n
	 * @returns (int) Math.random() * n + 1
	 */
	//method
	public int roll()
	{
		return (int) Math.random() * n + 1;
	}
}
