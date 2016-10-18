package ex9_erik_isaac;


/**
 * Escriu un formulari que converteixi nombres inferiors a 5000 a xifres romanes.
 * El valor dels diferents nombres romans és el següent:
 * I=1, V=5, X=10, L=50, C=100, D=500, M=1000.
 * @author Erik_Isaac
 * @version 18/10/2016 1.0
 */
public class Conversor {
    
    /**
     * Constructor with none params.
     */
    public Conversor(){
        
    }
    
    /**
     * Converts the integer number given by parameters into a romanic number.
     * This method only works with numbers positives than 0 and lowest than 5000.
     * @param number Ingeger positive and lower than 5000 number to convert into romanic.
     * @return String contains romanic number.
     */
    public String numberToRomanic(int number){
      String romanic = "";
      int thousands = number / 1000;
      int hundreds = number / 100 % 10;
      int docens = number / 10 % 10;
      int units = number % 10;
      //romanic = "thousands:" + thousands + "\nhundreds:" + hundreds + "\ndocens:" + docens + "\nunits:" + units;
      
      //Calculate the thousands.
      romanic += thousandsToRomanic(thousands);
      //Calculate the hundreds.
      romanic += hundredsToRomanic(hundreds);
      //Calculate the docens.
      romanic += docensToRomanic(docens);
      //Calculate the units.
      romanic += unitsToRomanic(units);
      
      return romanic;
    }
    
    /**
     * Converts the integer number given by parameters into thousands in romanic.
     * @param thousands int number of one digit represents the thousands.
     * @return String contains thousands in romanic number.
     */
    public String thousandsToRomanic(int thousands) {
        String romanic = "";
        for(int i = 0; i < thousands; i++) {
            romanic += "M";
        }
        return romanic;
    }
    
    /**
     * Converts the integer number given by parameters into hundreds in romanic.
     * @param hundreds int number of one digit represents the hundreds.
     * @return String contains hundreds in romanic number.
     */
    public String hundredsToRomanic(int hundreds) {
        String romanic = "";
        if(hundreds < 4) {
            for(int i = 0; i < hundreds; i++) {
                romanic += "C";
            }
        } else if(hundreds == 4) {
            romanic += "CD";
        } else if(hundreds < 9) {
            romanic += "D";
            for(int i = 0; i < hundreds - 5; i++) {
                romanic += "C";
            }
        } else {
            romanic += "CM";
        }
        return romanic;
    }
    
    /**
     * Converts the integer number given by parameters into docens in romanic.
     * @param docens int number of one digit represents the docens.
     * @return String contains docens in romanic number.
     */
    public String docensToRomanic(int docens) {
        String romanic = "";
        if(docens < 4) {
            for(int i = 0; i < docens; i++) {
                romanic += "X";
            }
        } else if(docens == 4) {
            romanic += "XL";
        } else if(docens < 9) {
            romanic += "L";
            for(int i = 0; i < docens - 5; i++) {
                romanic += "X";
            }
        } else {
            romanic += "XC";
        }
        return romanic;
    }
    
    /**
     * Converts the integer number given by parameters into units in romanic.
     * @param units int number of one digit represents the units.
     * @return String contains units in romanic number.
     */
    public String unitsToRomanic(int units) {
        String romanic = "";
        if(units < 4) {
            for(int i = 0; i < units; i++) {
                romanic += "I";
            }
        } else if(units == 4) {
            romanic += "IV";
        } else if(units < 9) {
            romanic += "V";
            for(int i = 0; i < units - 5; i++) {
                romanic += "I";
            }
        } else {
            romanic += "IX";
        }
        return romanic;
    }
}
