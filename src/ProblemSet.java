import java.util.ArrayList;
import java.util.List;

public class ProblemSet {

	/**
	 * Q1 Implement a function that return the factorial of n. You MUST use
	 * recursion. For example, factorial(3) should yield 6 because factorial(3) = 3
	 * * 2 * 1 Assume 20 >= n >= 1
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		// TODO: implement this method
		return 0;

	}

	/**
	 * Q2 Given a positive integer as input, subtract another positive integer
	 * continually until 0 or a negative value is reached, and then continually add
	 * the second integer until the first integer is again reached. For this
	 * question, do not end output with a newline. 
	 * 
	 * For example, printNumPattern(12, 3) will output "12 9 6 3 0 3 6 9 12" to the console
	 * 
	 * @param input
	 */
	public static void printNumPattern(int num1, int num2) {
		// TODO: implement this method
	}

	/**
	 * Q3 Implement a method that return the reverse of the input string. You MUST
	 * use recursion. For example, reverseString("abc") should return "cba" Assume
	 * length(input) >= 0 and all letters in input are lower-case
	 * 
	 * @param input
	 * @return
	 */
	public static String reverseString(String input) {
		// TODO: implement this method
		return null;
	}

	/**
	 * Q4 Challenge, Optional 
	 * 
	 * Implement a method that counts the number of 1-bit in
	 * java int value. You MUST use recursion. Given that the "int" data type in
	 * java is a 32-bit signed two's complement integer 
	 * 
	 * For example, countNumberOfOneBit(5) returns 2, because the last 4 bits of the 2C
	 * representation of 5 is "0101" Assume the input n >= 0
	 * 
	 * @param n
	 * @return
	 */
	public static int countNumberOfOneBit(int n) {
		// TODO: implement this method
		return 0;
	}

	/**
	 * Q5 Challenge, Optional 
	 * 
	 * Implement a method that, given a list of distinct
	 * integers, returns lists of all possible permutations. You MUST use recursion.
	 * 
	 * For example, countNumberOfOneBit({1, 2}) returns {{1, 2}, {2, 1}} Assume the
	 * length(input) >= 1 Hint, you might want to write a recursive helper method
	 * 
	 * @param n
	 * @return
	 */
	public static List<List<Integer>> permutation(List<Integer> list) {
		// TODO: implement this method
		return null;
	}

	/*
	 * Q6 Given an input array, shiftArray method shift the arr elements to the
	 * right by n unit For example: shiftArray({1, 2, 3, 4, 5}, 2) returns {4, 5, 1,
	 * 2, 3} It is guaranteed that arr.length >= 0 and n <= arr.length
	 * 
	 * Task: Based on the D.R.Y. principle, improve this method to reduce the amount
	 * of repeated code hint: move the repeated part into a helper method
	 */
	public static void shiftArray(int[] arr, int n) {

		// validate input
		if (arr.length <= 1 || arr.length == n) {
			return;
		}

		int len = arr.length;

		// reverse the entire input array
		int left = 0;
		int right = len - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		// reverse the input array from 0 to n - 1
		left = 0;
		right = n - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		// reverse the input array from n to arr.length - 1
		left = n;
		right = len - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

}
