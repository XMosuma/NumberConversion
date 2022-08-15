package NumberConversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberConversion {

    public static int userInput(){

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number in Decimal from 0 to 10000: ");
            int number= scanner.nextInt();
            if (number <=10000){
                return number;
            }
        } catch( InputMismatchException ex1 ) {
            System.err.println("Invalid input!!!!");
        }
        return userInput();
    }
    public static void decimalHexadecimal(int number){
        String hexadecimal_Number = Integer.toHexString(number);
        System.out.println("Decimal number of : " + number +" is : "+ hexadecimal_Number +" in Hexadecimal");
    }

    public static int decimalBinary(int number){
        String binary_Number = Integer.toBinaryString(number);
        System.out.println("Decimal number of :" + number +" is "+ binary_Number +" in Binaries");
        return Integer.parseInt((binary_Number));
    }
    public static void binaryDecimal(int decimal_Number,int decimal_Num ){

        System.out.println("Binary number of : " +  decimal_Number +" is "+ decimal_Num +" in Decimal");
    }
}
