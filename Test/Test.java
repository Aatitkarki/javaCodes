
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main (String args[]){
    for(int i=0;i<5;i++){
    for(int j=0;j<=i;j++){
    System.out.print("*");}
    System.out.println();
    }
    Test obj1=new Test();
    obj1.fibonancci();
    }
    
    public void fibonancci(){
    int a=0;
    int b =1;
    System.out.print(a+","+b);
    for(int i =0;i<8;i++){
    int c=a+b;
    System.out.print(c);
    a=b;
    b=c;
    }
    }
}
for( int i =0; i<8; i++);
for(int j=0;j<=i;j++);
