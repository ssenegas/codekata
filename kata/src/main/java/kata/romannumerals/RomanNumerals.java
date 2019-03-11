package kata.romannumerals;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class RomanNumerals {
	private static final Map<Integer, String> ROMANNUMERALS = ImmutableMap.<Integer, String> builder()
			.put(1000, "M")
			.put(900, "CM")
			.put(500, "D")
			.put(400, "CD")
			.put(100, "C")
			.put(90, "XC")
			.put(50, "L")
			.put(40, "XL")
			.put(10, "X")
			.put(9, "IX")
			.put(5, "V")
			.put(4, "IV")
			.put(1, "I")
			.build();
	
	public static String convertToRoman(int arabic) {
		StringBuilder sb = new StringBuilder();
		
		for (int value: ROMANNUMERALS.keySet()) {
			for (; arabic >= value; arabic -= value) {
				sb.append(ROMANNUMERALS.get(value));
			}
		}
		
		return sb.toString();
	}
}
