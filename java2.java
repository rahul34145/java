import java.util.Scanner;
// import java.io.*;

class java2{
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("Enter the marks");
        Scanner sc = new Scanner(System.in);
        float sum=0;
        
        for(int i=1;i<=5;i++){
            System.out.println("Marks of subject"+i);
            float m=sc.nextFloat();
            sum=sum+m;
            
            
        }
        float avg=sum/5;
        System.out.println("Total marks="+sum);
        System.out.println("average is "+avg);
        float perc=(sum/500)*100;
        System.out.println("Percentage"+perc+"%");

    }
    
}