/**
 * Author Name: ABHIMANYU AHLUWALIA
 * Class ID: 304
 * Assignment #2
 * Description: There is a class called Calculator which consists
 *              of different methods namely getTotal, add, subtract,
 *              multiply, divide and getHistory including a constructor.
 */

package cse360assign2;

/**
 * A class Calculator consists of different methods and each method
 * performs certain operations.
 */
public class Calculator 
{
	private int total;
	
	/**
	 * A constructor of Calculator class which initializes total variable
	 * equals to zero.
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This method returns the total when called.
	 * @return the total at the moment when called.
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * This method adds the parameter passed to the variable total.
	 * @param value   the value passed by the user
	 */
	public void add (int value) 
	{
		total = total + value;
	}
	
	/**
	 * This method subtracts the parameter 'value' from total.
	 * @param value   the value passed by the user
	 */
	public void subtract (int value) 
	{
		total = total - value;
	}
	
	/**
	 * This method multiply the parameter 'value' to total.
	 * @param value   the value passed by the user
	 */
	public void multiply (int value) 
	{
		total = total * value;
	}
	
	/**
	 * This method equals total to zero if the parameter passed
	 * is equal to zero. Else, it divides the total to the parameter
	 * 'value'.
	 * @param value   the value passed by the user
	 */
	public void divide (int value) 
	{
		if(value == 0)
		{
			total = 0;
		}
		
		total = total/value;
	}
	
	/**
	 * This method returns an empty string.
	 * @return   an empty string
	 */
	public String getHistory () 
	{
		return " ";
	}
}