package code.kata.roman.one;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;

public class RomanNumeralToIntegerConverterTest {

	private RomanNumeralToIntegerConverter converter = new RomanNumeralToIntegerConverter();

	@Test
	public void test_convert_GivenNull_ThenReturnNull() {
		Integer result = converter.convert((String) null);
		assertThat(result).isNull();
	}

	@Test
	public void test_convert_GivenRomanI_ThenReturn1() {
		Integer result = converter.convert("I");
		assertThat(result).isEqualTo(1);
	}

	// Test V -> 5
  @Test
	public void test_convert_GivenRomanV_ThenReturn5() {
		Integer result = converter.convert("V");
		assertThat(result).isEqualTo(5);
	}

	// Test X -> 10
  @Test
	public void test_convert_GivenRomanX_ThenReturn10() {
		Integer result = converter.convert("X");
		assertThat(result).isEqualTo(10);
	}

	// Test L -> 50
  @Test
	public void test_convert_GivenRomanL_ThenReturn50() {
		Integer result = converter.convert("L");
		assertThat(result).isEqualTo(50);
	}

	// Test C -> 100
    @Test
	public void test_convert_GivenRomanC_ThenReturn100() {
		Integer result = converter.convert("C");
		assertThat(result).isEqualTo(100);
	}

	// Test D -> 500
  @Test
	public void test_convert_GivenRomanD_ThenReturn500() {
		Integer result = converter.convert("D");
		assertThat(result).isEqualTo(500);
	}

	// Test M -> 1000
  @Test
	public void test_convert_GivenRomanM_ThenReturn1000() {
		Integer result = converter.convert("M");
		assertThat(result).isEqualTo(1000);
	}
  
	// Test II -> 2
  @Test
	public void test_convert_GivenRomanII_ThenReturn2() {
		Integer result = converter.convert("II");
		assertThat(result).isEqualTo(2);
	}

	// Test III -> 3

	// Test XX -> 20

	// Test XXX -> 30

	// Test CC -> 200

	// Test CCC -> 300

	// Test IV -> 4

	// Test IX -> 9

	// Test XL -> 40

	// Test XC -> 90

	// Test CD -> 400

	// Test CM -> 900

	// Fehler bei allem au�er I, V, X, L, C, D, M
}