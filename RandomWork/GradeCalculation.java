
/**
 * Write a description of class GradeCalculation here.
 *
 * @author (your name)
 * @version (a version number or a date)

   */
 import java.util.Scanner;
public class GradeCalculation

{
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number total number of subject: ");
        int totalSubject = sc.nextInt();
        double [] marks = new double[totalSubject];
        for(int i =0;i<marks.length;i++){
        System.out.print("Enter the mark of subject of index "+i);
        marks[i] = sc.nextInt();
        }
        double totalObtainedMark = getTotalObtainedMark(marks);
        System.out.println("The total mark is "+totalObtainedMark);
        int totalMark=marks.length * 100;
        double percent = percentFinder(totalMark, totalObtainedMark);
        System.out.println("The total percent obtained is "+percent);
        String division = divisionFinder(percent);
        System.out.println("You have obtained "+division);
        String grade = gradeFinder(percent);
        System.out.println("Your grade is "+grade);
    }
    static double getTotalObtainedMark(double []marks){
        double sum =0;
        for(int i =0;i<marks.length;i++){
            sum +=marks[i];
        }
        return sum;
    }
    
    static double percentFinder(int totalMarks,double totalObtainedMark){
        double percent = (totalObtainedMark/totalMarks)*100;
        return percent;
    }
    
    static String divisionFinder(double percentage){
        if(percentage>=0){
        return "Distinction";
    }else if(percentage>=60){
        return "First Division";
    }
    else if(percentage>=40){
        return "Second Division";
    }else{
    return "Fail";
}

            
           
    
    }
    
    
    static String gradeFinder(double percentage){
        if(percentage>=90){
        return "A+";
    }else if(percentage>=80){
        return "A";
    }
    else if(percentage>=70){
        return "B+";
    }
    else if(percentage>=60){
        return "B";
    }
    else if(percentage>=50){
        return "C+";
    }
    else if(percentage>=40){
        return "C";
    }
    else if(percentage>=32){
        return "D+";
    }else{
    return "E";
}

            
           
    
    }
}
