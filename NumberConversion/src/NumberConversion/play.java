package NumberConversion;

import java.util.InputMismatchException;
import java.util.Scanner;

import static NumberConversion.NumberConversion.*;

public class play{
    public static void main(String arg[]){

        String play = "";
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter play to start converting/exit");
                play= scanner.nextLine();

            } catch( InputMismatchException ex1 ) {
                System.err.println("Invalid input!!!!");
            }
            if(play.equalsIgnoreCase("exit")){
                break;
            }
            else {
                int number = userInput();
                decimalHexadecimal(number);
                if(number >= 2 & number <= 10){
                    int decimal_Number = decimalBinary(number);
                    binaryDecimal(decimal_Number,number);
                }
            }


        }


    }
}
