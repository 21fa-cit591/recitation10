
public class RecapExample {
	/**
	 * 1 Implement a method print the string in reverse order to the console. You
	 * MUST use recursion. For example, printReverseString("abcd") should print
	 * "dcba\n" to the console
	 * 
	 * @param n
	 * @return
	 */
	public static void printReverseString(String input) {
		// TODO: implement this method
		// What would be the normal way to print reverse?
//		for (int i = input.length() - 1; i >= 0; i --) {
//			System.out.print(input.charAt(i));
//		}
		// How can we infer BC and sub-problem from the normal way?
		
		if (input.length() <= 1) {
			System.out.println(input);
			return;
		}
		System.out.print(input.charAt(input.length()-1));
		printReverseString(input.substring(0, input.length()-1));
		
	}

	/**
	 * 2 Implement a method that counts the number of digits in java int value. You
	 * MUST use recursion. Given that the "int" data type in java is a 32-bit signed
	 * two's complement integer For example, countDigit(115) returns 3, because
	 * there are 3 digits in the number 115 Assume the input n > 0
	 * 
	 * @param n
	 * @return
	 */
	public static int countDigit(int n) {
		// TODO: implement this method
		
//		int count = 0;
//		while (n != 0) {
//			count ++;
//			n /= 10;
//		}
		
		if (n == 0) {
			return 0;
		}
		
		
		
		return 1 + countDigit(n/10);
	}

	public static void main (String[] args) {
		printReverseString("abc");
		System.out.println(countDigit(115));
	}
}
