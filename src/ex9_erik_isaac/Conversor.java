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
     * Converts the decimal number given by parameters into a romanic number.
     * This method only works with numbers positives than 0 and lowest than 5000.
     * @param number Decimal positive and lower than 5000 number to convert into romanic.
     * @return String contains romanic number.
     */
    public String numberToromanic(int number){
      String romanic = "";
      int thousands = number / 1000;
      int hundreds = number / 100 % 10;
      int docens = number / 10 % 10;
      int units = number % 10;
      //romanic = "thousands:" + thousands + "\nhundreds:" + hundreds + "\ndocens:" + docens + "\nunits:" + units;
      
      //Calculate the thousands.
      for(int i = 0; i < thousands; i++) {
          romanic += "M";
      }
      //Calculate the hundreds.
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
      //Calculate the docens.
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
      //Calculate the units.
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
