package code.kata.roman.one;

public class RomanNumeralToIntegerConverter {

    public Integer convert(String romanNumeral) {

        if (romanNumeral == null) {
            return null;
        }

        switch (romanNumeral) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            case "II":
                return 2;
            default:
                return null;
        }
    }
}