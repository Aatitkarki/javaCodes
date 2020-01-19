
/**
 * Write a description of class CheckData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CheckData
{
    public static void main (String [] args){
    System.out.println("Enter the data which you want to check");
    Scanner sc = new Scanner(System.in);
    char data =sc.next().charAt(0);
    int a = (int)data;
    if(a>=65 && a<=122){
        System.out.println("The data is Alphabet");
        
    }else if(a>=48 && a<=57){
        System.out.println("The data is Digit");
    }else{
    System.out.println("The data is special Character!");
    }
    }
}
