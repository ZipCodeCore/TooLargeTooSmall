import java.util.Random;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args){
        generateWinningNum();
        System.out.println("I'm thinking of a number between 1 and " + maxNumber + ", type a guess");
       // int numOfGuess = 0;
        while(winningNum != guess){
            int input = Integer.parseInt(myScanner.nextLine());
            if(input != guess){
                numOfGuess++;
            }
            guess = input;
            checkGuess();
        }
    }
    public static int numOfGuess = 0;
    public static Scanner myScanner = new Scanner(System.in);
    public static int winningNum;
    public static int maxNumber = 100;
    public static int guess;

    public static void checkGuess(){
        if(guess > winningNum){
            System.out.println("Too high try again!");
        } else if(guess < winningNum){
            System.out.println("Too low try again");
        }else{
            System.out.println("Tell em what he's won johnny! It took you " + numOfGuess + " tries " );
        }
    }
    public static void generateWinningNum(){
        Random rand = new Random();
        winningNum = rand.nextInt(maxNumber);
    }


}
