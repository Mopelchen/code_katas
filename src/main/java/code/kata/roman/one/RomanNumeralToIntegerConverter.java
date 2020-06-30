package code.kata.roman.one;

public class RomanNumeralToIntegerConverter {

	public Integer convert(String romanNumeral) {
    
		if (romanNumeral == null) {
      return null;
    }     
    
    switch (romanNumeral) {
      case "V": return 5;
      case "I": return 1;
      case "X": return 10;
      case "L": return 50;
      case "C": return 100;
      case "D": return 500;
      case "M": return 1000;
      case "II": return 2;
      default:  return null;
    }
  }
}
// Klaus: Läuft :)

// kommt hier die main-methode?
// Nope. Funktioniert hier ein bisschen anders. Wir konzentrieren uns auf eine Klasse plus Test und lassen Maven und das Surefire-Plugin im Hintergrund alles weitere machen