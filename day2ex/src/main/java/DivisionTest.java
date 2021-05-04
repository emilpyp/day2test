import java.util.Scanner;
import java.lang.Math;

public class DivisionTest {
    public static void main(String[] args) {
        /*int num;
        System.out.println("Please enter a number between 1 and 1000");
        while(true){
            try{

                Scanner input = new Scanner(System.in);
                num = input.nextInt();
                if ((num < 1) || (num > 1000)) {
                    System.out.println("Please enter a number between 1 and 1000");
                    continue;
                }
                for(int i = 1; i < num; i++){
                    if((i % 3 == 0) && (i % 20 ==3 )) {
                        System.out.println(i);
                    }
                }
            }
            catch(Exception e){
                System.out.println("Please enter a valid number");
            }
        }*/

        /*int num;
        System.out.println("Please enter a number between 1 and 1000");
        while(true){
            try{

                Scanner input = new Scanner(System.in);
                num = input.nextInt();
                if ((num < 1) || (num > 1000)) {
                    System.out.println("Please enter a number between 1 and 1000");
                    continue;
                }
                for(int i = 1; i <= num; i++){
                    int sum = 0;
                    int n = i;
                    if(i % 5 == 0) {
                        while (n > 0) {
                            sum = sum + n % 10;
                            n = n / 10;
                        }
                        if(sum % 5 == 0) System.out.println(i);
                    }
                }
            }
            catch(Exception e){
                System.out.println("Please enter a valid number");
            }
        }*/
        //System.out.println(swapDigits(2345));
        //System.out.println(firstToLast(2111111111));

        //System.out.println(findOddPlaces(1234563424));
        //System.out.println(swapDigits(1234563424));
        for(int i=0; i <10; i++){
            System.out.println(String.format("%d: %d", i, powerOf10(i)));
        }

    }
    /*
    Swap first and last digits of a given number.
    Ex. 2345 -> 5342
     */
    public static int swapDigits(int input){
        //Swap first and last digits
        int first = 0;
        int last;
        int num_digits = 0;
        // Find last digit
        last = input % 10;

        int loop_var = input;
        while(loop_var > 0){
            first = loop_var % 10;
            loop_var = loop_var / 10;
            num_digits ++;
        }
        int result = (int) (last * Math.pow(10, num_digits-1));
        result += input % (Math.pow(10, num_digits-1));
        result = (result - last) + first;
        return result;
    }

    /*
    Put the first digit of a number in the last place.
    Ex. 2345 -> 3452
     */
    public static int firstToLast(int input){
        int firstDigit;
        int result;
        int num_digits = num_digits(input);
        int multiple = powerOf10(num_digits-1);
        firstDigit = (input / multiple);
        result = (input % multiple) * 10 + firstDigit;
        return result;
    }

    /*
    Return numbers of digits in a given number
     */
    public static int num_digits(int input){
        int num_digits = 0;
        while(input > 0){
            input /= 10;
            num_digits ++;
        }
        return num_digits;
    }

    /*
    Custom power of 10 method
     */
    public static int powerOf10(int num_digits){
        int result = 1;
        for (int i = 0; i < num_digits; i++){
            result *= 10;
        }
        return result;
    }

    /*
    Find and return digits in
    Modified by Emil
    aksaca,cac,a c
     */
    public static int findOddPlaces(int input){
        int result = 0;
        int exponent = 100;
        int numDigits = (num_digits(input) + 1) / 2;
        for(int j = 0; j<numDigits; j++){
            result = result + (input % 10) * powerOf10(j);
            input /= exponent;
        }
        return result;
    }
}
