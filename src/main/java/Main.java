import java.util.Random;
import java.util.Scanner;

public class  Main {

    public static void main(String[] args){
        assignNum();
        System.out.println("My Guess is:");
        while(correctNum != guess){
            guess = Integer.parseInt(myScanner.nextLine());
            checkGuess(guess);
        }

        System.out.println(guess);
        System.out.println(correctNum);
    }
    public static int numOfGuess;
    public static Scanner myScanner = new Scanner(System.in);
    public static int correctNum;
    public static int maxNumber = 100;
    public static int guess;

    public static void checkGuess(int guess){
        if(guess > correctNum ){
            System.out.println("To high try again!");
        } else if(guess < correctNum){
            System.out.println("To low try again");
        }else{
            System.out.println("Tell em what he's won johnny!");
        }

    }
    public static void assignNum(){
        Random rand = new Random();
        correctNum = rand.nextInt(maxNumber);
    }





}
