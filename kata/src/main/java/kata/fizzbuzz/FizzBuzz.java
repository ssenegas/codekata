package kata.fizzbuzz;

/**
 * FizzBuzz kata
 * 
 * The rules
 * 1. If divisible by 3, return "Fizz"
 * 2. If divisible by 5, return "Buzz"
 * 3. If divisible by 3 and 5, return "FizzBuzz"
 * 4. If none of the above, return i
 * 
 */
public class FizzBuzz {

	private FizzBuzz() {
		throw new IllegalStateException("Utility class");
	}

	public static String of(int number) {
		if (number == 0) throw new IllegalArgumentException("Number is smaller than 1");
		
		String answer = String.valueOf(number);

		if (isMultipleOfThree(number) && isMultipleOfFive(number)) {
			answer = "FizzBuzz";
		} else if (isMultipleOfThree(number)) {
			answer = "Fizz";
		} else if (isMultipleOfFive(number)) {
			answer = "Buzz";
		}
		return answer;
	}

	private static boolean isMultipleOfFive(int i) {
		return i % 5 == 0;
	}

	private static boolean isMultipleOfThree(int i) {
		return i % 3 == 0;
	}
}
