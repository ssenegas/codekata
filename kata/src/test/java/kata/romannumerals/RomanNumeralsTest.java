package kata.romannumerals;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {
	@Test
	public void oneShouldReturnI() {
		assertThat(RomanNumerals.convertToRoman(1), is("I"));
	}

	@Test
	public void twoShouldReturnII() {
		assertThat(RomanNumerals.convertToRoman(2), is("II"));
	}
	
	@Test
	public void threeShouldReturnII() {
		assertThat(RomanNumerals.convertToRoman(3), is("III"));
	}
	
	@Test
	public void fourShouldReturnIV() {
		assertThat(RomanNumerals.convertToRoman(4), is("IV"));
	}
	
	@Test
	public void fiveShouldReturnV() {
		assertThat(RomanNumerals.convertToRoman(5), is("V"));
	}

	@Test
	public void sixShouldReturnVI() {
		assertThat(RomanNumerals.convertToRoman(6), is("VI"));
	}

	@Test
	public void sevenShouldReturnVII() {
		assertThat(RomanNumerals.convertToRoman(7), is("VII"));
	}
	
	@Test
	public void nineShouldReturnIX() {
		assertThat(RomanNumerals.convertToRoman(9), is("IX"));
	}
	
	@Test
	public void tenShouldReturnX() {
		assertThat(RomanNumerals.convertToRoman(10), is("X"));
	}

	@Test
	public void elevenShouldReturnXI() {
		assertThat(RomanNumerals.convertToRoman(11), is("XI"));
	}

	@Test
	public void testFourteenShouldReturnXIV() {
		assertThat(RomanNumerals.convertToRoman(14), is("XIV"));
	}

	@Test
	public void testHeighteenShouldReturnXVIII() {
		assertThat(RomanNumerals.convertToRoman(18), is("XVIII"));
	}

	@Test
	public void testNineteenShouldReturnXIX() {
		assertThat(RomanNumerals.convertToRoman(19), is("XIX"));
	}

	@Test
	public void testTweentyShouldReturnXX() {
		assertThat(RomanNumerals.convertToRoman(20), is("XX"));
		Assert.assertEquals("XX", RomanNumerals.convertToRoman(20));
	}

	@Test
	public void testTweentyOneShouldReturn() {
		assertThat(RomanNumerals.convertToRoman(21), is("XXI"));
	}

	@Test
	public void testTweentyFourShouldReturnXXIV() {
		assertThat(RomanNumerals.convertToRoman(24), is("XXIV"));
	}

	@Test
	public void testTweentyNineShouldReturnXXIX() {
		assertThat(RomanNumerals.convertToRoman(29), is("XXIX"));
	}
	
	@Test
	public void testThirtyShouldReturn() {
		assertThat(RomanNumerals.convertToRoman(30), is("XXX"));
	}	

	@Test
	public void testFortyShouldReturnXL() {
		assertThat(RomanNumerals.convertToRoman(40), is("XL"));
	}	
	
	@Test
	public void testFiftyShouldReturnL() {
		assertThat(RomanNumerals.convertToRoman(50), is("L"));
	}	

	@Test
	public void testNinetyShouldReturnXC() {
		assertThat(RomanNumerals.convertToRoman(90), is("XC"));
	}	

	@Test
	public void testOneHundredShouldReturn() {
		assertThat(RomanNumerals.convertToRoman(100), is("C"));
	}	

	@Test
	public void testThreeHundredSixtyNineShouldReturnCCCLXIX() {
		assertThat(RomanNumerals.convertToRoman(369), is("CCCLXIX"));
	}	

	@Test
	public void testFourHundredFortyHeightShouldReturnCDXLVIII() {
		assertThat(RomanNumerals.convertToRoman(448), is("CDXLVIII"));
	}	

	@Test
	public void testOneThousandFifteenShouldReturnMDXV() {
		assertThat(RomanNumerals.convertToRoman(1515), is("MDXV"));
	}	

	@Test
	public void testOneThousandNineHundredNinetyShouldReturnMCMXCVIII() {
		assertThat(RomanNumerals.convertToRoman(1998), is("MCMXCVIII"));
	}	

	@Test
	public void testTwoThousandNineteenShouldReturnMMXIX() {
		assertThat(RomanNumerals.convertToRoman(2019), is("MMXIX"));
	}	
	
	@Test
	public void testThreeThousandFourHundredNinetyFiveShouldReturnMMMCDXCV() {
		assertThat(RomanNumerals.convertToRoman(3495), is("MMMCDXCV"));
	}
}
