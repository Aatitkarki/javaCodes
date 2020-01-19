
/**
 * Write a description of class ArrayReverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ArrayReverse
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int [] array1 = new int[size];
        int [] revarray= new int[size];
        System.out.println("Enter the values of array!");
        int length = revarray.length;
        for(int i =0; i<size;i++){
        array1[i]=sc.nextInt();
        revarray[length-1]=array1[i];
        length--;
        }
        for(int i=0;i<revarray.length ;i++){
        System.out.print(revarray[i]+",");
        }
        
        
    }
}
