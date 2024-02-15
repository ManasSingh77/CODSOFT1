package CodSoft;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Guess The Number game");
        System.out.println("Rules:");
        System.out.println("Total Number of attempts are 7");
        System.out.println("Range of Numbers are from 1 to 100");
        while(true) {
            Random rn = new Random();
            int val = rn.nextInt(100) + 1;
            int attempt=7;
            while(attempt>0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                if(guess<1 || guess>100){
                    System.out.println("Enter a valid number");
                    continue;
                }
                if (guess == val) {
                    System.out.println("Correct You Won!");
                    System.out.println("Number of attempts taken: "+ (7-attempt+1));
                    break;
                }
                attempt=attempt-1;
                if(attempt==0){
                    System.out.println("Better Luck Next Time ");
                    System.out.println("Correct Answer was: "+ val);
                    break;
                }
                if (guess < val) {
                    System.out.println("Your Guess is too low");
                    System.out.println("Number of attempts remaining: "+attempt);
                } else {
                    System.out.println("Your Guess is too high");
                    System.out.println("Number of attempts remaining: "+attempt);
                }
            }
            System.out.println("Do you want to play again? Type Yes/No");
            String m=sc.next();
             m=m.toLowerCase();
            if(m.equals("no")){
                break;
            }
        }
        System.out.println("Thanks for playing");
    }
}
