package kata.fizzbuzz;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test(expected=IllegalArgumentException.class)
	public void zeroShouldThrowException() {
		assertThat(FizzBuzz.of(0), is("0"));
	}

	@Test
	public void OneShouldReturnOne() {
		Assert.assertEquals("1", FizzBuzz.of(1));
	}

	@Test
	public void threeShouldReturnFizz() {
		Assert.assertEquals("Fizz", FizzBuzz.of(3));
	}

	@Test
	public void fiveShouldReturnBuzz() {
		Assert.assertEquals("Buzz", FizzBuzz.of(5));
	}

	@Test
	public void sixShouldReturnFizz() {
		Assert.assertEquals("Fizz", FizzBuzz.of(6));
	}

	@Test
	public void tenShouldReturnBuzz() {
		Assert.assertEquals("Buzz", FizzBuzz.of(10));
	}
	
	@Test
	public void fifteenShouldReturnFizzBuzz() {
		Assert.assertEquals("FizzBuzz", FizzBuzz.of(15));
	}
	
	@Test
	public void thirtyShouldReturnFizzBuzz() {
		Assert.assertEquals("FizzBuzz", FizzBuzz.of(30));
	}
}
