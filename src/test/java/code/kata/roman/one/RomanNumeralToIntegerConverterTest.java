package code.kata.roman.one;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;

public class RomanNumeralToIntegerConverterTest {

    private final RomanNumeralToIntegerConverter converter = new RomanNumeralToIntegerConverter();

    @Ignore
    @Test
    public void test_convert_GivenNull_ThenReturnNull() {
        Integer result = converter.convert(null);
        assertThat(result).isNull();
    }

    @Ignore
    @Test
    public void test_convert_GivenRomanI_ThenReturn1() {
        Integer result = converter.convert("I");
        assertThat(result).isEqualTo(1);
    }

    // Test V -> 5
    @Ignore
    @Test
    public void test_convert_GivenRomanV_ThenReturn5() {
        Integer result = converter.convert("V");
        assertThat(result).isEqualTo(5);
    }

    // Test X -> 10
    @Ignore
    @Test
    public void test_convert_GivenRomanX_ThenReturn10() {
        Integer result = converter.convert("X");
        assertThat(result).isEqualTo(10);
    }

    // Test L -> 50
    @Ignore
    @Test
    public void test_convert_GivenRomanL_ThenReturn50() {
        Integer result = converter.convert("L");
        assertThat(result).isEqualTo(50);
    }

    // Test C -> 100
    @Ignore
    @Test
    public void test_convert_GivenRomanC_ThenReturn100() {
        Integer result = converter.convert("C");
        assertThat(result).isEqualTo(100);
    }

    // Test D -> 500
    @Ignore
    @Test
    public void test_convert_GivenRomanD_ThenReturn500() {
        Integer result = converter.convert("D");
        assertThat(result).isEqualTo(500);
    }

    // Test M -> 1000
    @Ignore
    @Test
    public void test_convert_GivenRomanM_ThenReturn1000() {
        Integer result = converter.convert("M");
        assertThat(result).isEqualTo(1000);
    }

    // Test II -> 2
    @Ignore
    @Test
    public void test_convert_GivenRomanII_ThenReturn2() {
        Integer result = converter.convert("II");
        assertThat(result).isEqualTo(2);
    }

    // Test III -> 3
    @Ignore
    @Test
    public void test_convert_GivenRomanIII_ThenReturn3() {
        Integer result = converter.convert("III");
        assertThat(result).isEqualTo(3);
    }

    // Test XX -> 20
    @Ignore
    @Test
    public void test_convert_GivenRomanXX_ThenReturn20() {
        Integer result = converter.convert("XX");
        assertThat(result).isEqualTo(20);
    }

    // Test XXX -> 30
    @Ignore
    @Test
    public void test_convert_GivenRomanXXX_ThenReturn30() {
        Integer result = converter.convert("XXX");
        assertThat(result).isEqualTo(30);
    }

    // Test CC -> 200
    @Ignore
    @Test
    public void test_convert_GivenRomanCC_ThenReturn200() {
        Integer result = converter.convert("CC");
        assertThat(result).isEqualTo(200);
    }

    // Test CCC -> 300
    @Ignore
    @Test
    public void test_convert_GivenRomanCCC_ThenReturn300() {
        Integer result = converter.convert("CCC");
        assertThat(result).isEqualTo(300);
    }

    // Test MM -> 2000
    @Ignore
    @Test
    public void test_convert_GivenRomanMM_ThenReturn2000() {
        Integer result = converter.convert("MM");
        assertThat(result).isEqualTo(2000);
    }

    // Test MMM -> 3000
    @Ignore
    @Test
    public void test_convert_GivenRomanMMM_ThenReturn3000() {
        Integer result = converter.convert("MMM");
        assertThat(result).isEqualTo(3000);
    }

    // Test IV -> 4
    @Test
    public void test_convert_GivenRomanIV_ThenReturn4() {
        Integer result = converter.convert("IV");
        assertThat(result).isEqualTo(4);
    }

    // Test IX -> 9
    @Test
    public void test_convert_GivenRomanIX_ThenReturn9() {
        Integer result = converter.convert("IX");
        assertThat(result).isEqualTo(9);
    }


    // Test XL -> 40
    @Ignore
    @Test
    public void test_convert_GivenRomanXL_ThenReturn40() {
        Integer result = converter.convert("XL");
        assertThat(result).isEqualTo(40);
    }

    // Test XC -> 90
    @Ignore
    @Test
    public void test_convert_GivenRomanXC_ThenReturn90() {
        Integer result = converter.convert("XC");
        assertThat(result).isEqualTo(90);
    }

    // Test CD -> 400
    @Ignore
    @Test
    public void test_convert_GivenRomanCD_ThenReturn400() {
        Integer result = converter.convert("CD");
        assertThat(result).isEqualTo(400);
    }

    // Test CM -> 900
    @Ignore
    @Test
    public void test_convert_GivenRomanCD_ThenReturn900() {
        Integer result = converter.convert("CM");
        assertThat(result).isEqualTo(900);
    }

    // Fehler bei allem ausser I, V, X, L, C, D, M
}