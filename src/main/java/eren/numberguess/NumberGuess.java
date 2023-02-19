/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.numberguess;

/**
 *
 * @author ereni
 */
import java.util.Scanner;
import java.util.Random;
public class NumberGuess {

    public static void main(String[] args) {
Scanner guessNum = new Scanner(System.in);
            Random randNum = new Random();
           int userGuess;
           int randomNum;
           char newPlay;
       do {
           
           randomNum = randNum.nextInt(1000) + 1;
           System.out.println("Guess a number 1-1000");
           userGuess = guessNum.nextInt();
           while(userGuess != randomNum){
               if (userGuess > randomNum){
                   System.out.println("Your guess it too high. Try Again");
               }
               else{
                   System.out.println("Number guessed is too low. Try Again");
           }
               userGuess = guessNum.nextInt();
           }
           System.out.println("You got the number right!");
           System.out.println("Enter Y to play again");
             newPlay = guessNum.next().charAt(0);
       }while ( newPlay == 'Y');
       
       }
       }
    
    
    
    

