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

	@Ignore("To be implemented")
	@Test
	public void test_convert_GivenRomanI_ThenReturn1() {
		Integer result = converter.convert("I");
		assertThat(result).isNull();
	}

	// Test V -> 5

	// Test X -> 10

	// Test L -> 50

	// Test C -> 100

	// Test D -> 500

	// Test M -> 1000

	// Test II -> 2

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

	// Fehler bei allem auﬂer I, V, X, L, C, D, M
}