package ex9_erik_isaac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main class.
 * @author Erik_Isaac
 * @version 18/10/2016 1.0
 */
public class Ex9_Erik_Isaac {
   
    public static void main(String[] args) {
        int number = 0;
        String romanicNumber = "";
        Conversor conversor = new Conversor();
        do {
            System.out.println("Put 5000 to exit.");
            //User input positive Number.
            number = inputPositiveNumber();
            if(number < 5000) {
                romanicNumber = conversor.numberToromanic(number);
                System.out.println("Romanic:" + romanicNumber);
            } else if(number != 5000){
                System.out.println("Wrong, the number is need to be lower than 5000.");
            } 
        } while(number != 5000);
    }
    
    /**
     * Ask the user for a positive number.
     * If user puts non valid number, ask it again.
     * @return int number.
     */
    public static int inputPositiveNumber() {
        int number = 0; 
        boolean correct = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                System.out.print("Insert number:");
                number = Integer.parseInt(reader.readLine());
                if(number > 0) {
                    correct = true;
                } else {
                    System.out.println("Wrong value, expected positive number.");
                }
            } catch (IOException e) {
                System.out.println("Unexpected error.");
            } catch (NumberFormatException e) {
                System.out.println("Wrong value, expected a number.");
            }
        } while(!correct);
        return number;
    }
    
}
