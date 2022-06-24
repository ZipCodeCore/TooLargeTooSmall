import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    //public static String PrintResult(int userInput){
    //if(userInput < 5){
    //System.out.println("too small")
    // }
    //}
    public static void main(String[] args){
        System.out.println("Zipcode rocks!");

        int userInput;
        Scanner in = new Scanner (System. in);
        System.out.print ("Guess a number: ");
        userInput = in.nextInt();
        Math.random();
        Random num = new Random();
        int randomNum1 = num.nextInt(10);
        int userInputCount = 0;
        userInputCount++;
        System.out.println(userInputCount);
        boolean correctGuess = false;
        while (!correctGuess) {

             if  (userInput == randomNum1) {
                System.out.println("correct guess");
            } else if (userInput > randomNum1) {
                System.out.println("too large"); }
               else if (userInput < randomNum1)
                {System.out.println("too small");
            }

            }
        }

    }



