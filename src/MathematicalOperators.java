
public class MathematicalOperators {

	public static void main(String[] args) {
		//define variables
		int x = 5;
		int y = 3;
		int z;

		//simple addition
		z = x + y;
		System.out.println("addition " + z);

		//simple subtraction
		z = y - x;
		System.out.println("subtraction " + z);

		//simple multiplication
		z = x * y;
		System.out.println("multiplication " + z);

		//simple division
		z = x / y;
		System.out.println("division " + z);

		//simple modulus
		z = x % y;
		System.out.println("modulus " + z);

		//float vs. int
		float f = 3.6f;
		int i = 22;
		double result = (float)f + i;

		System.out.println(result);
	}

}
