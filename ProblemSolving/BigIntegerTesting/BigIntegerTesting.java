import java.math.BigInteger;

public class BigIntegerTesting{
	
	/*BigInteger is a class from the Math
	  package that allows
	  for the manipulation of very large integers
	  It has special operations to replace
	  +, -, *, etc
	*/

	public static void main(String[] args) {
		
		//Creating a big Integer:

		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		//BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");

		//Comparing big Integer equality:

		boolean a = (zero.equals(one));
		//System.out.println(a);

		//Big Integer subtraction:

		BigInteger two = three.subtract(one);
		System.out.println(two);

	}


}