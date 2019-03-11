package kata.nameinverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameInverter {

	private NameInverter() {
		throw new IllegalStateException("Utility class");
	}
	
	public static String invert(String name) {
		List<String> nameParts = splitIntoPartsIgnoringWhitespace(name);
		
		if (nameParts.size() < 2)
			return nameParts.get(0);
		
		return invert(withoutHonorifics(nameParts)); 
	}

	private static List<String> withoutHonorifics(List<String> nameParts) {
		String s = nameParts.get(0);
		if (Honorifics.isHonorific(s)) {
			nameParts.remove(0);
		}
		
		return nameParts;
	}

	private static List<String> splitIntoPartsIgnoringWhitespace(String name) {
		return new ArrayList<>(Arrays.asList(name.trim().split(RegularExpressions.ANY_WHITESPACE_CHARACTERS)));
	}

	private static String invert(List<String> nameParts) {
		String first = nameParts.get(0);
		String last = nameParts.get(1);
		String postnaminals = findAndMergePostnominals(nameParts);
		
		return String.format("%s, %s %s", last, first, postnaminals).trim();
	}

	private static String findAndMergePostnominals(List<String> nameParts) {
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i < nameParts.size(); i++)
			sb.append(nameParts.get(i) + " ");
		return sb.toString();
	}
}

class RegularExpressions {
	public static final String ANY_WHITESPACE_CHARACTERS = "\\s+";

	private RegularExpressions() {
		throw new IllegalStateException("Utility class");
	}
}

class Honorifics {
	private static final List<String> KNOWNHONORIFICS = Arrays.asList("Mr.", "Mrs.");
	
	private Honorifics() {
		throw new IllegalStateException("Utility class");
	}
	
	public static boolean isHonorific(String s) {
		return KNOWNHONORIFICS.contains(s);
	}
}
