package code.kata.roman.one;

public class RomanNumeralToIntegerConverter {
    
    public Integer convert(String romanNumeral) {

      if (romanNumeral == null || romanNumeral.isEmpty()) {
          return null;
      }

      Integer summe = 0;

      System.out.println("-----------------------------------------");
      System.out.println(romanNumeral);
      for (int i = 0; i < romanNumeral.length(); i++){

        String current = romanNumeral.substring(i, i+1);
        boolean nextSignExists = i < romanNumeral.length() - 1;

        System.out.println("Index:" +i);
        System.out.println("Aktuelles Zeichen: " + current);

        if(nextSignExists && 
            isNextLargerThanCurrent(current, getNext(romanNumeral, i))) {
            summe -= convertToInt(current);
            System.out.println(summe);
        } else {
            summe += convertToInt(current);
            System.out.println(summe);
        }
      }

      return summe;
    }

    private Integer convertToInt(String romanNumeral) {
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
            default:
                return null;
        }
    }

    private boolean isNextLargerThanCurrent(String current, String next) {
      return convertToInt(next) > convertToInt(current);
    }

    private String getNext(String romanNumeral, int index) {
      return romanNumeral.substring(index+1, index+2);
    }
}
