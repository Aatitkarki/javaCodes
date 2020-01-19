
/**
 * Write a description of class FilesHandling here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FilesHandling
{   
    public static void write(String data){
        try{
            FileWriter fw =new FileWriter("new.txt",true);//true writes the new value in the same file
            fw.write(data+"\n");
            fw.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    public static void read(){
        try{
        FileReader fr = new FileReader("new.txt");
        int ch;
        System.out.println("This is the file you have written");
        while ((ch=fr.read()) !=-1){
        
        System.out.print((char)ch);
        }
        fr.close();
    }catch(FileNotFoundException ioe){
    ioe.printStackTrace();
    }
    catch(IOException ioe){
        ioe.printStackTrace();
    }
    }
    
    public static void run(){
        System.out.println("Please Enter the string you want to write!");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        write(data);
        read();
    }

    // public static void main (String [] args){
        // FilesHandling obj = new FilesHandling();
        // System.out.println("Please Enter the string you want to write!");
        // Scanner sc = new Scanner(System.in);
        // String data = sc.nextLine();
        // obj.write(data);
        // obj.read();
    // }
}
