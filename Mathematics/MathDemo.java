
import java.util.Scanner;
public class MathDemo{
	public static void main(String[]args){

		Mathematics obj = new Mathematics();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of which you want to find the average: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		float result1=obj.average(num1,num2);
		System.out.println("The average of the number is "+result1);

		System.out.println("How many array do you want to store? ");
		int arrayn=sc.nextInt();
		System.out.println("Enter the array: ");
		int array[]=new int[arrayn];
		for(int i=0;i<arrayn;i++){
			int x=sc.nextInt();
			array[i]=x;
		}
		float result2=obj.average(array);
		System.out.println("The average of array is "+result2);
		
		System.out.println("Enter the number and its power: ");
		int n=sc.nextInt();
		int p=sc.nextInt();
		int result3=obj.power(n,p);
		System.out.println(n+" to the power of "+p+" is "+result3);

		System.out.println("Enter the number you want to know if it is prime or not:");
		int checknum=sc.nextInt();
		boolean result4= obj.Prime(checknum);
		if(result4==true){
			System.out.print("The number is Prime.");
		}
		else{
			System.out.print("The number is not prime.");
		}
		}
}