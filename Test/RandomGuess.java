
/**
 * Write a description of class RandomGuess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RandomGuess
{
    public static void main (String [] args){
        int ranNum= (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number");
        int life =10;
        while(life>=1){
            int userNum= sc.nextInt();
            if(userNum==ranNum){
            System.out.println("Congratulation your guess is correct!");
            break;
            }else if(userNum>ranNum){
                System.out.println("You have guessed high! Think low buddy");
            }else{
            System.out.println("Dont go too low! Think big!");
            }
            life--;
            if(life==0){
            System.out.println("Sorry buddy you have reached the limit of guess! Come later!");}
        
        }
        
    }
}
