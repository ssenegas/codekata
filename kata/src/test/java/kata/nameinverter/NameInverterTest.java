package kata.nameinverter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class NameInverterTest {
	
	@Test
	public void emptyShouldReturnEmptyString() {
		assertThat(NameInverter.invert(""), is(""));
		assertThat(NameInverter.invert("     "), is(""));
	}
	
	@Test
	public void firstnameShouldReturnFirst() {
		assertThat(NameInverter.invert("John"), is("John"));
		assertThat(NameInverter.invert("     John   "), is("John"));
	}
	
	@Test
	public void firstLastShouldReturnLastCommaFirst() {
		assertThat(NameInverter.invert("John Smith"), is("Smith, John"));
		assertThat(NameInverter.invert("John    Smith"), is("Smith, John"));
	}
	
	@Test
	public void honorificsShouldReturnLastCommaFirst() {
		assertThat(NameInverter.invert("Mr. John Smith"), is("Smith, John"));
		assertThat(NameInverter.invert("Mrs. Jane Smith"), is("Smith, Jane"));
	}
	
	@Test
	public void postnominalsShouldReturnLastCommaFirstPostnominals() {
		assertThat(NameInverter.invert("John Smith Sr. PhD."), is("Smith, John Sr. PhD."));
	}
	
	@Test
	public void acceptanceTest() {
		assertThat(NameInverter.invert("Mr.     John     Smith Sr. PhD.   "), is("Smith, John Sr. PhD."));
	}
}
